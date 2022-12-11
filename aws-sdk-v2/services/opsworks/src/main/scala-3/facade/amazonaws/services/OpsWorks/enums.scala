package facade.amazonaws.services.opsworks

import scalajs.js

type AppAttributesKeys = "DocumentRoot" | "RailsEnv" | "AutoBundleOnDeploy" | "AwsFlowRubySettings"
object AppAttributesKeys {
  inline val DocumentRoot: "DocumentRoot" = "DocumentRoot"
  inline val RailsEnv: "RailsEnv" = "RailsEnv"
  inline val AutoBundleOnDeploy: "AutoBundleOnDeploy" = "AutoBundleOnDeploy"
  inline val AwsFlowRubySettings: "AwsFlowRubySettings" = "AwsFlowRubySettings"

  inline def values: js.Array[AppAttributesKeys] = js.Array(DocumentRoot, RailsEnv, AutoBundleOnDeploy, AwsFlowRubySettings)
}

type AppType = "aws-flow-ruby" | "java" | "rails" | "php" | "nodejs" | "static" | "other"
object AppType {
  inline val `aws-flow-ruby`: "aws-flow-ruby" = "aws-flow-ruby"
  inline val java: "java" = "java"
  inline val rails: "rails" = "rails"
  inline val php: "php" = "php"
  inline val nodejs: "nodejs" = "nodejs"
  inline val static: "static" = "static"
  inline val other: "other" = "other"

  inline def values: js.Array[AppType] = js.Array(`aws-flow-ruby`, java, rails, php, nodejs, static, other)
}

type Architecture = "x86_64" | "i386"
object Architecture {
  inline val x86_64: "x86_64" = "x86_64"
  inline val i386: "i386" = "i386"

  inline def values: js.Array[Architecture] = js.Array(x86_64, i386)
}

type AutoScalingType = "load" | "timer"
object AutoScalingType {
  inline val load: "load" = "load"
  inline val timer: "timer" = "timer"

  inline def values: js.Array[AutoScalingType] = js.Array(load, timer)
}

/** Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>. Encodings supported by Python <code>codecs.decode()</code> can be used here.
  */
type CloudWatchLogsEncoding =
  "ascii" | "big5" | "big5hkscs" | "cp037" | "cp424" | "cp437" | "cp500" | "cp720" | "cp737" | "cp775" | "cp850" | "cp852" | "cp855" | "cp856" | "cp857" | "cp858" | "cp860" | "cp861" | "cp862" | "cp863" | "cp864" | "cp865" | "cp866" | "cp869" | "cp874" | "cp875" | "cp932" | "cp949" | "cp950" | "cp1006" | "cp1026" | "cp1140" | "cp1250" | "cp1251" | "cp1252" | "cp1253" | "cp1254" | "cp1255" | "cp1256" | "cp1257" | "cp1258" | "euc_jp" | "euc_jis_2004" | "euc_jisx0213" | "euc_kr" | "gb2312" | "gbk" | "gb18030" | "hz" | "iso2022_jp" | "iso2022_jp_1" | "iso2022_jp_2" | "iso2022_jp_2004" | "iso2022_jp_3" | "iso2022_jp_ext" | "iso2022_kr" | "latin_1" | "iso8859_2" | "iso8859_3" | "iso8859_4" | "iso8859_5" | "iso8859_6" | "iso8859_7" | "iso8859_8" | "iso8859_9" | "iso8859_10" | "iso8859_13" | "iso8859_14" | "iso8859_15" | "iso8859_16" | "johab" | "koi8_r" | "koi8_u" | "mac_cyrillic" | "mac_greek" | "mac_iceland" | "mac_latin2" | "mac_roman" | "mac_turkish" | "ptcp154" | "shift_jis" | "shift_jis_2004" | "shift_jisx0213" | "utf_32" | "utf_32_be" | "utf_32_le" | "utf_16" | "utf_16_be" | "utf_16_le" | "utf_7" | "utf_8" | "utf_8_sig"
object CloudWatchLogsEncoding {
  inline val ascii: "ascii" = "ascii"
  inline val big5: "big5" = "big5"
  inline val big5hkscs: "big5hkscs" = "big5hkscs"
  inline val cp037: "cp037" = "cp037"
  inline val cp424: "cp424" = "cp424"
  inline val cp437: "cp437" = "cp437"
  inline val cp500: "cp500" = "cp500"
  inline val cp720: "cp720" = "cp720"
  inline val cp737: "cp737" = "cp737"
  inline val cp775: "cp775" = "cp775"
  inline val cp850: "cp850" = "cp850"
  inline val cp852: "cp852" = "cp852"
  inline val cp855: "cp855" = "cp855"
  inline val cp856: "cp856" = "cp856"
  inline val cp857: "cp857" = "cp857"
  inline val cp858: "cp858" = "cp858"
  inline val cp860: "cp860" = "cp860"
  inline val cp861: "cp861" = "cp861"
  inline val cp862: "cp862" = "cp862"
  inline val cp863: "cp863" = "cp863"
  inline val cp864: "cp864" = "cp864"
  inline val cp865: "cp865" = "cp865"
  inline val cp866: "cp866" = "cp866"
  inline val cp869: "cp869" = "cp869"
  inline val cp874: "cp874" = "cp874"
  inline val cp875: "cp875" = "cp875"
  inline val cp932: "cp932" = "cp932"
  inline val cp949: "cp949" = "cp949"
  inline val cp950: "cp950" = "cp950"
  inline val cp1006: "cp1006" = "cp1006"
  inline val cp1026: "cp1026" = "cp1026"
  inline val cp1140: "cp1140" = "cp1140"
  inline val cp1250: "cp1250" = "cp1250"
  inline val cp1251: "cp1251" = "cp1251"
  inline val cp1252: "cp1252" = "cp1252"
  inline val cp1253: "cp1253" = "cp1253"
  inline val cp1254: "cp1254" = "cp1254"
  inline val cp1255: "cp1255" = "cp1255"
  inline val cp1256: "cp1256" = "cp1256"
  inline val cp1257: "cp1257" = "cp1257"
  inline val cp1258: "cp1258" = "cp1258"
  inline val euc_jp: "euc_jp" = "euc_jp"
  inline val euc_jis_2004: "euc_jis_2004" = "euc_jis_2004"
  inline val euc_jisx0213: "euc_jisx0213" = "euc_jisx0213"
  inline val euc_kr: "euc_kr" = "euc_kr"
  inline val gb2312: "gb2312" = "gb2312"
  inline val gbk: "gbk" = "gbk"
  inline val gb18030: "gb18030" = "gb18030"
  inline val hz: "hz" = "hz"
  inline val iso2022_jp: "iso2022_jp" = "iso2022_jp"
  inline val iso2022_jp_1: "iso2022_jp_1" = "iso2022_jp_1"
  inline val iso2022_jp_2: "iso2022_jp_2" = "iso2022_jp_2"
  inline val iso2022_jp_2004: "iso2022_jp_2004" = "iso2022_jp_2004"
  inline val iso2022_jp_3: "iso2022_jp_3" = "iso2022_jp_3"
  inline val iso2022_jp_ext: "iso2022_jp_ext" = "iso2022_jp_ext"
  inline val iso2022_kr: "iso2022_kr" = "iso2022_kr"
  inline val latin_1: "latin_1" = "latin_1"
  inline val iso8859_2: "iso8859_2" = "iso8859_2"
  inline val iso8859_3: "iso8859_3" = "iso8859_3"
  inline val iso8859_4: "iso8859_4" = "iso8859_4"
  inline val iso8859_5: "iso8859_5" = "iso8859_5"
  inline val iso8859_6: "iso8859_6" = "iso8859_6"
  inline val iso8859_7: "iso8859_7" = "iso8859_7"
  inline val iso8859_8: "iso8859_8" = "iso8859_8"
  inline val iso8859_9: "iso8859_9" = "iso8859_9"
  inline val iso8859_10: "iso8859_10" = "iso8859_10"
  inline val iso8859_13: "iso8859_13" = "iso8859_13"
  inline val iso8859_14: "iso8859_14" = "iso8859_14"
  inline val iso8859_15: "iso8859_15" = "iso8859_15"
  inline val iso8859_16: "iso8859_16" = "iso8859_16"
  inline val johab: "johab" = "johab"
  inline val koi8_r: "koi8_r" = "koi8_r"
  inline val koi8_u: "koi8_u" = "koi8_u"
  inline val mac_cyrillic: "mac_cyrillic" = "mac_cyrillic"
  inline val mac_greek: "mac_greek" = "mac_greek"
  inline val mac_iceland: "mac_iceland" = "mac_iceland"
  inline val mac_latin2: "mac_latin2" = "mac_latin2"
  inline val mac_roman: "mac_roman" = "mac_roman"
  inline val mac_turkish: "mac_turkish" = "mac_turkish"
  inline val ptcp154: "ptcp154" = "ptcp154"
  inline val shift_jis: "shift_jis" = "shift_jis"
  inline val shift_jis_2004: "shift_jis_2004" = "shift_jis_2004"
  inline val shift_jisx0213: "shift_jisx0213" = "shift_jisx0213"
  inline val utf_32: "utf_32" = "utf_32"
  inline val utf_32_be: "utf_32_be" = "utf_32_be"
  inline val utf_32_le: "utf_32_le" = "utf_32_le"
  inline val utf_16: "utf_16" = "utf_16"
  inline val utf_16_be: "utf_16_be" = "utf_16_be"
  inline val utf_16_le: "utf_16_le" = "utf_16_le"
  inline val utf_7: "utf_7" = "utf_7"
  inline val utf_8: "utf_8" = "utf_8"
  inline val utf_8_sig: "utf_8_sig" = "utf_8_sig"

  inline def values: js.Array[CloudWatchLogsEncoding] = js.Array(
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
  inline val start_of_file: "start_of_file" = "start_of_file"
  inline val end_of_file: "end_of_file" = "end_of_file"

  inline def values: js.Array[CloudWatchLogsInitialPosition] = js.Array(start_of_file, end_of_file)
}

/** The preferred time zone for logs streamed to CloudWatch Logs. Valid values are <code>LOCAL</code> and <code>UTC</code>, for Coordinated Universal Time.
  */
type CloudWatchLogsTimeZone = "LOCAL" | "UTC"
object CloudWatchLogsTimeZone {
  inline val LOCAL: "LOCAL" = "LOCAL"
  inline val UTC: "UTC" = "UTC"

  inline def values: js.Array[CloudWatchLogsTimeZone] = js.Array(LOCAL, UTC)
}

type DeploymentCommandName = "install_dependencies" | "update_dependencies" | "update_custom_cookbooks" | "execute_recipes" | "configure" | "setup" | "deploy" | "rollback" | "start" | "stop" | "restart" | "undeploy"
object DeploymentCommandName {
  inline val install_dependencies: "install_dependencies" = "install_dependencies"
  inline val update_dependencies: "update_dependencies" = "update_dependencies"
  inline val update_custom_cookbooks: "update_custom_cookbooks" = "update_custom_cookbooks"
  inline val execute_recipes: "execute_recipes" = "execute_recipes"
  inline val configure: "configure" = "configure"
  inline val setup: "setup" = "setup"
  inline val deploy: "deploy" = "deploy"
  inline val rollback: "rollback" = "rollback"
  inline val start: "start" = "start"
  inline val stop: "stop" = "stop"
  inline val restart: "restart" = "restart"
  inline val undeploy: "undeploy" = "undeploy"

  inline def values: js.Array[DeploymentCommandName] = js.Array(install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, configure, setup, deploy, rollback, start, stop, restart, undeploy)
}

type LayerAttributesKeys = "EcsClusterArn" | "EnableHaproxyStats" | "HaproxyStatsUrl" | "HaproxyStatsUser" | "HaproxyStatsPassword" | "HaproxyHealthCheckUrl" | "HaproxyHealthCheckMethod" | "MysqlRootPassword" | "MysqlRootPasswordUbiquitous" | "GangliaUrl" | "GangliaUser" | "GangliaPassword" | "MemcachedMemory" | "NodejsVersion" | "RubyVersion" | "RubygemsVersion" | "ManageBundler" | "BundlerVersion" | "RailsStack" | "PassengerVersion" | "Jvm" | "JvmVersion" | "JvmOptions" | "JavaAppServer" | "JavaAppServerVersion"
object LayerAttributesKeys {
  inline val EcsClusterArn: "EcsClusterArn" = "EcsClusterArn"
  inline val EnableHaproxyStats: "EnableHaproxyStats" = "EnableHaproxyStats"
  inline val HaproxyStatsUrl: "HaproxyStatsUrl" = "HaproxyStatsUrl"
  inline val HaproxyStatsUser: "HaproxyStatsUser" = "HaproxyStatsUser"
  inline val HaproxyStatsPassword: "HaproxyStatsPassword" = "HaproxyStatsPassword"
  inline val HaproxyHealthCheckUrl: "HaproxyHealthCheckUrl" = "HaproxyHealthCheckUrl"
  inline val HaproxyHealthCheckMethod: "HaproxyHealthCheckMethod" = "HaproxyHealthCheckMethod"
  inline val MysqlRootPassword: "MysqlRootPassword" = "MysqlRootPassword"
  inline val MysqlRootPasswordUbiquitous: "MysqlRootPasswordUbiquitous" = "MysqlRootPasswordUbiquitous"
  inline val GangliaUrl: "GangliaUrl" = "GangliaUrl"
  inline val GangliaUser: "GangliaUser" = "GangliaUser"
  inline val GangliaPassword: "GangliaPassword" = "GangliaPassword"
  inline val MemcachedMemory: "MemcachedMemory" = "MemcachedMemory"
  inline val NodejsVersion: "NodejsVersion" = "NodejsVersion"
  inline val RubyVersion: "RubyVersion" = "RubyVersion"
  inline val RubygemsVersion: "RubygemsVersion" = "RubygemsVersion"
  inline val ManageBundler: "ManageBundler" = "ManageBundler"
  inline val BundlerVersion: "BundlerVersion" = "BundlerVersion"
  inline val RailsStack: "RailsStack" = "RailsStack"
  inline val PassengerVersion: "PassengerVersion" = "PassengerVersion"
  inline val Jvm: "Jvm" = "Jvm"
  inline val JvmVersion: "JvmVersion" = "JvmVersion"
  inline val JvmOptions: "JvmOptions" = "JvmOptions"
  inline val JavaAppServer: "JavaAppServer" = "JavaAppServer"
  inline val JavaAppServerVersion: "JavaAppServerVersion" = "JavaAppServerVersion"

  inline def values: js.Array[LayerAttributesKeys] = js.Array(
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
  inline val `aws-flow-ruby`: "aws-flow-ruby" = "aws-flow-ruby"
  inline val `ecs-cluster`: "ecs-cluster" = "ecs-cluster"
  inline val `java-app`: "java-app" = "java-app"
  inline val lb: "lb" = "lb"
  inline val web: "web" = "web"
  inline val `php-app`: "php-app" = "php-app"
  inline val `rails-app`: "rails-app" = "rails-app"
  inline val `nodejs-app`: "nodejs-app" = "nodejs-app"
  inline val memcached: "memcached" = "memcached"
  inline val `db-master`: "db-master" = "db-master"
  inline val `monitoring-master`: "monitoring-master" = "monitoring-master"
  inline val custom: "custom" = "custom"

  inline def values: js.Array[LayerType] = js.Array(`aws-flow-ruby`, `ecs-cluster`, `java-app`, lb, web, `php-app`, `rails-app`, `nodejs-app`, memcached, `db-master`, `monitoring-master`, custom)
}

type RootDeviceType = "ebs" | "instance-store"
object RootDeviceType {
  inline val ebs: "ebs" = "ebs"
  inline val `instance-store`: "instance-store" = "instance-store"

  inline def values: js.Array[RootDeviceType] = js.Array(ebs, `instance-store`)
}

type SourceType = "git" | "svn" | "archive" | "s3"
object SourceType {
  inline val git: "git" = "git"
  inline val svn: "svn" = "svn"
  inline val archive: "archive" = "archive"
  inline val s3: "s3" = "s3"

  inline def values: js.Array[SourceType] = js.Array(git, svn, archive, s3)
}

type StackAttributesKeys = "Color"
object StackAttributesKeys {
  inline val Color: "Color" = "Color"

  inline def values: js.Array[StackAttributesKeys] = js.Array(Color)
}

type VirtualizationType = "paravirtual" | "hvm"
object VirtualizationType {
  inline val paravirtual: "paravirtual" = "paravirtual"
  inline val hvm: "hvm" = "hvm"

  inline def values: js.Array[VirtualizationType] = js.Array(paravirtual, hvm)
}

type VolumeType = "gp2" | "io1" | "standard"
object VolumeType {
  inline val gp2: "gp2" = "gp2"
  inline val io1: "io1" = "io1"
  inline val standard: "standard" = "standard"

  inline def values: js.Array[VolumeType] = js.Array(gp2, io1, standard)
}
