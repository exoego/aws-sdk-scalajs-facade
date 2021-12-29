package facade.amazonaws.services.devicefarm

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ArtifactCategory extends js.Any
object ArtifactCategory {
  val SCREENSHOT = "SCREENSHOT".asInstanceOf[ArtifactCategory]
  val FILE = "FILE".asInstanceOf[ArtifactCategory]
  val LOG = "LOG".asInstanceOf[ArtifactCategory]

  @inline def values = js.Array(SCREENSHOT, FILE, LOG)
}

@js.native
sealed trait ArtifactType extends js.Any
object ArtifactType {
  val UNKNOWN = "UNKNOWN".asInstanceOf[ArtifactType]
  val SCREENSHOT = "SCREENSHOT".asInstanceOf[ArtifactType]
  val DEVICE_LOG = "DEVICE_LOG".asInstanceOf[ArtifactType]
  val MESSAGE_LOG = "MESSAGE_LOG".asInstanceOf[ArtifactType]
  val VIDEO_LOG = "VIDEO_LOG".asInstanceOf[ArtifactType]
  val RESULT_LOG = "RESULT_LOG".asInstanceOf[ArtifactType]
  val SERVICE_LOG = "SERVICE_LOG".asInstanceOf[ArtifactType]
  val WEBKIT_LOG = "WEBKIT_LOG".asInstanceOf[ArtifactType]
  val INSTRUMENTATION_OUTPUT = "INSTRUMENTATION_OUTPUT".asInstanceOf[ArtifactType]
  val EXERCISER_MONKEY_OUTPUT = "EXERCISER_MONKEY_OUTPUT".asInstanceOf[ArtifactType]
  val CALABASH_JSON_OUTPUT = "CALABASH_JSON_OUTPUT".asInstanceOf[ArtifactType]
  val CALABASH_PRETTY_OUTPUT = "CALABASH_PRETTY_OUTPUT".asInstanceOf[ArtifactType]
  val CALABASH_STANDARD_OUTPUT = "CALABASH_STANDARD_OUTPUT".asInstanceOf[ArtifactType]
  val CALABASH_JAVA_XML_OUTPUT = "CALABASH_JAVA_XML_OUTPUT".asInstanceOf[ArtifactType]
  val AUTOMATION_OUTPUT = "AUTOMATION_OUTPUT".asInstanceOf[ArtifactType]
  val APPIUM_SERVER_OUTPUT = "APPIUM_SERVER_OUTPUT".asInstanceOf[ArtifactType]
  val APPIUM_JAVA_OUTPUT = "APPIUM_JAVA_OUTPUT".asInstanceOf[ArtifactType]
  val APPIUM_JAVA_XML_OUTPUT = "APPIUM_JAVA_XML_OUTPUT".asInstanceOf[ArtifactType]
  val APPIUM_PYTHON_OUTPUT = "APPIUM_PYTHON_OUTPUT".asInstanceOf[ArtifactType]
  val APPIUM_PYTHON_XML_OUTPUT = "APPIUM_PYTHON_XML_OUTPUT".asInstanceOf[ArtifactType]
  val EXPLORER_EVENT_LOG = "EXPLORER_EVENT_LOG".asInstanceOf[ArtifactType]
  val EXPLORER_SUMMARY_LOG = "EXPLORER_SUMMARY_LOG".asInstanceOf[ArtifactType]
  val APPLICATION_CRASH_REPORT = "APPLICATION_CRASH_REPORT".asInstanceOf[ArtifactType]
  val XCTEST_LOG = "XCTEST_LOG".asInstanceOf[ArtifactType]
  val VIDEO = "VIDEO".asInstanceOf[ArtifactType]
  val CUSTOMER_ARTIFACT = "CUSTOMER_ARTIFACT".asInstanceOf[ArtifactType]
  val CUSTOMER_ARTIFACT_LOG = "CUSTOMER_ARTIFACT_LOG".asInstanceOf[ArtifactType]
  val TESTSPEC_OUTPUT = "TESTSPEC_OUTPUT".asInstanceOf[ArtifactType]

  @inline def values = js.Array(UNKNOWN, SCREENSHOT, DEVICE_LOG, MESSAGE_LOG, VIDEO_LOG, RESULT_LOG, SERVICE_LOG, WEBKIT_LOG, INSTRUMENTATION_OUTPUT, EXERCISER_MONKEY_OUTPUT, CALABASH_JSON_OUTPUT, CALABASH_PRETTY_OUTPUT, CALABASH_STANDARD_OUTPUT, CALABASH_JAVA_XML_OUTPUT, AUTOMATION_OUTPUT, APPIUM_SERVER_OUTPUT, APPIUM_JAVA_OUTPUT, APPIUM_JAVA_XML_OUTPUT, APPIUM_PYTHON_OUTPUT, APPIUM_PYTHON_XML_OUTPUT, EXPLORER_EVENT_LOG, EXPLORER_SUMMARY_LOG, APPLICATION_CRASH_REPORT, XCTEST_LOG, VIDEO, CUSTOMER_ARTIFACT, CUSTOMER_ARTIFACT_LOG, TESTSPEC_OUTPUT)
}

@js.native
sealed trait BillingMethod extends js.Any
object BillingMethod {
  val METERED = "METERED".asInstanceOf[BillingMethod]
  val UNMETERED = "UNMETERED".asInstanceOf[BillingMethod]

  @inline def values = js.Array(METERED, UNMETERED)
}

@js.native
sealed trait CurrencyCode extends js.Any
object CurrencyCode {
  val USD = "USD".asInstanceOf[CurrencyCode]

  @inline def values = js.Array(USD)
}

@js.native
sealed trait DeviceAttribute extends js.Any
object DeviceAttribute {
  val ARN = "ARN".asInstanceOf[DeviceAttribute]
  val PLATFORM = "PLATFORM".asInstanceOf[DeviceAttribute]
  val FORM_FACTOR = "FORM_FACTOR".asInstanceOf[DeviceAttribute]
  val MANUFACTURER = "MANUFACTURER".asInstanceOf[DeviceAttribute]
  val REMOTE_ACCESS_ENABLED = "REMOTE_ACCESS_ENABLED".asInstanceOf[DeviceAttribute]
  val REMOTE_DEBUG_ENABLED = "REMOTE_DEBUG_ENABLED".asInstanceOf[DeviceAttribute]
  val APPIUM_VERSION = "APPIUM_VERSION".asInstanceOf[DeviceAttribute]
  val INSTANCE_ARN = "INSTANCE_ARN".asInstanceOf[DeviceAttribute]
  val INSTANCE_LABELS = "INSTANCE_LABELS".asInstanceOf[DeviceAttribute]
  val FLEET_TYPE = "FLEET_TYPE".asInstanceOf[DeviceAttribute]
  val OS_VERSION = "OS_VERSION".asInstanceOf[DeviceAttribute]
  val MODEL = "MODEL".asInstanceOf[DeviceAttribute]
  val AVAILABILITY = "AVAILABILITY".asInstanceOf[DeviceAttribute]

  @inline def values = js.Array(ARN, PLATFORM, FORM_FACTOR, MANUFACTURER, REMOTE_ACCESS_ENABLED, REMOTE_DEBUG_ENABLED, APPIUM_VERSION, INSTANCE_ARN, INSTANCE_LABELS, FLEET_TYPE, OS_VERSION, MODEL, AVAILABILITY)
}

@js.native
sealed trait DeviceAvailability extends js.Any
object DeviceAvailability {
  val TEMPORARY_NOT_AVAILABLE = "TEMPORARY_NOT_AVAILABLE".asInstanceOf[DeviceAvailability]
  val BUSY = "BUSY".asInstanceOf[DeviceAvailability]
  val AVAILABLE = "AVAILABLE".asInstanceOf[DeviceAvailability]
  val HIGHLY_AVAILABLE = "HIGHLY_AVAILABLE".asInstanceOf[DeviceAvailability]

  @inline def values = js.Array(TEMPORARY_NOT_AVAILABLE, BUSY, AVAILABLE, HIGHLY_AVAILABLE)
}

@js.native
sealed trait DeviceFilterAttribute extends js.Any
object DeviceFilterAttribute {
  val ARN = "ARN".asInstanceOf[DeviceFilterAttribute]
  val PLATFORM = "PLATFORM".asInstanceOf[DeviceFilterAttribute]
  val OS_VERSION = "OS_VERSION".asInstanceOf[DeviceFilterAttribute]
  val MODEL = "MODEL".asInstanceOf[DeviceFilterAttribute]
  val AVAILABILITY = "AVAILABILITY".asInstanceOf[DeviceFilterAttribute]
  val FORM_FACTOR = "FORM_FACTOR".asInstanceOf[DeviceFilterAttribute]
  val MANUFACTURER = "MANUFACTURER".asInstanceOf[DeviceFilterAttribute]
  val REMOTE_ACCESS_ENABLED = "REMOTE_ACCESS_ENABLED".asInstanceOf[DeviceFilterAttribute]
  val REMOTE_DEBUG_ENABLED = "REMOTE_DEBUG_ENABLED".asInstanceOf[DeviceFilterAttribute]
  val INSTANCE_ARN = "INSTANCE_ARN".asInstanceOf[DeviceFilterAttribute]
  val INSTANCE_LABELS = "INSTANCE_LABELS".asInstanceOf[DeviceFilterAttribute]
  val FLEET_TYPE = "FLEET_TYPE".asInstanceOf[DeviceFilterAttribute]

  @inline def values = js.Array(ARN, PLATFORM, OS_VERSION, MODEL, AVAILABILITY, FORM_FACTOR, MANUFACTURER, REMOTE_ACCESS_ENABLED, REMOTE_DEBUG_ENABLED, INSTANCE_ARN, INSTANCE_LABELS, FLEET_TYPE)
}

@js.native
sealed trait DeviceFormFactor extends js.Any
object DeviceFormFactor {
  val PHONE = "PHONE".asInstanceOf[DeviceFormFactor]
  val TABLET = "TABLET".asInstanceOf[DeviceFormFactor]

  @inline def values = js.Array(PHONE, TABLET)
}

@js.native
sealed trait DevicePlatform extends js.Any
object DevicePlatform {
  val ANDROID = "ANDROID".asInstanceOf[DevicePlatform]
  val IOS = "IOS".asInstanceOf[DevicePlatform]

  @inline def values = js.Array(ANDROID, IOS)
}

@js.native
sealed trait DevicePoolType extends js.Any
object DevicePoolType {
  val CURATED = "CURATED".asInstanceOf[DevicePoolType]
  val PRIVATE = "PRIVATE".asInstanceOf[DevicePoolType]

  @inline def values = js.Array(CURATED, PRIVATE)
}

@js.native
sealed trait ExecutionResult extends js.Any
object ExecutionResult {
  val PENDING = "PENDING".asInstanceOf[ExecutionResult]
  val PASSED = "PASSED".asInstanceOf[ExecutionResult]
  val WARNED = "WARNED".asInstanceOf[ExecutionResult]
  val FAILED = "FAILED".asInstanceOf[ExecutionResult]
  val SKIPPED = "SKIPPED".asInstanceOf[ExecutionResult]
  val ERRORED = "ERRORED".asInstanceOf[ExecutionResult]
  val STOPPED = "STOPPED".asInstanceOf[ExecutionResult]

  @inline def values = js.Array(PENDING, PASSED, WARNED, FAILED, SKIPPED, ERRORED, STOPPED)
}

@js.native
sealed trait ExecutionResultCode extends js.Any
object ExecutionResultCode {
  val PARSING_FAILED = "PARSING_FAILED".asInstanceOf[ExecutionResultCode]
  val VPC_ENDPOINT_SETUP_FAILED = "VPC_ENDPOINT_SETUP_FAILED".asInstanceOf[ExecutionResultCode]

  @inline def values = js.Array(PARSING_FAILED, VPC_ENDPOINT_SETUP_FAILED)
}

@js.native
sealed trait ExecutionStatus extends js.Any
object ExecutionStatus {
  val PENDING = "PENDING".asInstanceOf[ExecutionStatus]
  val PENDING_CONCURRENCY = "PENDING_CONCURRENCY".asInstanceOf[ExecutionStatus]
  val PENDING_DEVICE = "PENDING_DEVICE".asInstanceOf[ExecutionStatus]
  val PROCESSING = "PROCESSING".asInstanceOf[ExecutionStatus]
  val SCHEDULING = "SCHEDULING".asInstanceOf[ExecutionStatus]
  val PREPARING = "PREPARING".asInstanceOf[ExecutionStatus]
  val RUNNING = "RUNNING".asInstanceOf[ExecutionStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ExecutionStatus]
  val STOPPING = "STOPPING".asInstanceOf[ExecutionStatus]

  @inline def values = js.Array(PENDING, PENDING_CONCURRENCY, PENDING_DEVICE, PROCESSING, SCHEDULING, PREPARING, RUNNING, COMPLETED, STOPPING)
}

@js.native
sealed trait InstanceStatus extends js.Any
object InstanceStatus {
  val IN_USE = "IN_USE".asInstanceOf[InstanceStatus]
  val PREPARING = "PREPARING".asInstanceOf[InstanceStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[InstanceStatus]
  val NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[InstanceStatus]

  @inline def values = js.Array(IN_USE, PREPARING, AVAILABLE, NOT_AVAILABLE)
}

@js.native
sealed trait InteractionMode extends js.Any
object InteractionMode {
  val INTERACTIVE = "INTERACTIVE".asInstanceOf[InteractionMode]
  val NO_VIDEO = "NO_VIDEO".asInstanceOf[InteractionMode]
  val VIDEO_ONLY = "VIDEO_ONLY".asInstanceOf[InteractionMode]

  @inline def values = js.Array(INTERACTIVE, NO_VIDEO, VIDEO_ONLY)
}

@js.native
sealed trait NetworkProfileType extends js.Any
object NetworkProfileType {
  val CURATED = "CURATED".asInstanceOf[NetworkProfileType]
  val PRIVATE = "PRIVATE".asInstanceOf[NetworkProfileType]

  @inline def values = js.Array(CURATED, PRIVATE)
}

@js.native
sealed trait OfferingTransactionType extends js.Any
object OfferingTransactionType {
  val PURCHASE = "PURCHASE".asInstanceOf[OfferingTransactionType]
  val RENEW = "RENEW".asInstanceOf[OfferingTransactionType]
  val SYSTEM = "SYSTEM".asInstanceOf[OfferingTransactionType]

  @inline def values = js.Array(PURCHASE, RENEW, SYSTEM)
}

@js.native
sealed trait OfferingType extends js.Any
object OfferingType {
  val RECURRING = "RECURRING".asInstanceOf[OfferingType]

  @inline def values = js.Array(RECURRING)
}

@js.native
sealed trait RecurringChargeFrequency extends js.Any
object RecurringChargeFrequency {
  val MONTHLY = "MONTHLY".asInstanceOf[RecurringChargeFrequency]

  @inline def values = js.Array(MONTHLY)
}

@js.native
sealed trait RuleOperator extends js.Any
object RuleOperator {
  val EQUALS = "EQUALS".asInstanceOf[RuleOperator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[RuleOperator]
  val LESS_THAN_OR_EQUALS = "LESS_THAN_OR_EQUALS".asInstanceOf[RuleOperator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[RuleOperator]
  val GREATER_THAN_OR_EQUALS = "GREATER_THAN_OR_EQUALS".asInstanceOf[RuleOperator]
  val IN = "IN".asInstanceOf[RuleOperator]
  val NOT_IN = "NOT_IN".asInstanceOf[RuleOperator]
  val CONTAINS = "CONTAINS".asInstanceOf[RuleOperator]

  @inline def values = js.Array(EQUALS, LESS_THAN, LESS_THAN_OR_EQUALS, GREATER_THAN, GREATER_THAN_OR_EQUALS, IN, NOT_IN, CONTAINS)
}

@js.native
sealed trait SampleType extends js.Any
object SampleType {
  val CPU = "CPU".asInstanceOf[SampleType]
  val MEMORY = "MEMORY".asInstanceOf[SampleType]
  val THREADS = "THREADS".asInstanceOf[SampleType]
  val RX_RATE = "RX_RATE".asInstanceOf[SampleType]
  val TX_RATE = "TX_RATE".asInstanceOf[SampleType]
  val RX = "RX".asInstanceOf[SampleType]
  val TX = "TX".asInstanceOf[SampleType]
  val NATIVE_FRAMES = "NATIVE_FRAMES".asInstanceOf[SampleType]
  val NATIVE_FPS = "NATIVE_FPS".asInstanceOf[SampleType]
  val NATIVE_MIN_DRAWTIME = "NATIVE_MIN_DRAWTIME".asInstanceOf[SampleType]
  val NATIVE_AVG_DRAWTIME = "NATIVE_AVG_DRAWTIME".asInstanceOf[SampleType]
  val NATIVE_MAX_DRAWTIME = "NATIVE_MAX_DRAWTIME".asInstanceOf[SampleType]
  val OPENGL_FRAMES = "OPENGL_FRAMES".asInstanceOf[SampleType]
  val OPENGL_FPS = "OPENGL_FPS".asInstanceOf[SampleType]
  val OPENGL_MIN_DRAWTIME = "OPENGL_MIN_DRAWTIME".asInstanceOf[SampleType]
  val OPENGL_AVG_DRAWTIME = "OPENGL_AVG_DRAWTIME".asInstanceOf[SampleType]
  val OPENGL_MAX_DRAWTIME = "OPENGL_MAX_DRAWTIME".asInstanceOf[SampleType]

  @inline def values = js.Array(CPU, MEMORY, THREADS, RX_RATE, TX_RATE, RX, TX, NATIVE_FRAMES, NATIVE_FPS, NATIVE_MIN_DRAWTIME, NATIVE_AVG_DRAWTIME, NATIVE_MAX_DRAWTIME, OPENGL_FRAMES, OPENGL_FPS, OPENGL_MIN_DRAWTIME, OPENGL_AVG_DRAWTIME, OPENGL_MAX_DRAWTIME)
}

@js.native
sealed trait TestGridSessionArtifactCategory extends js.Any
object TestGridSessionArtifactCategory {
  val VIDEO = "VIDEO".asInstanceOf[TestGridSessionArtifactCategory]
  val LOG = "LOG".asInstanceOf[TestGridSessionArtifactCategory]

  @inline def values = js.Array(VIDEO, LOG)
}

@js.native
sealed trait TestGridSessionArtifactType extends js.Any
object TestGridSessionArtifactType {
  val UNKNOWN = "UNKNOWN".asInstanceOf[TestGridSessionArtifactType]
  val VIDEO = "VIDEO".asInstanceOf[TestGridSessionArtifactType]
  val SELENIUM_LOG = "SELENIUM_LOG".asInstanceOf[TestGridSessionArtifactType]

  @inline def values = js.Array(UNKNOWN, VIDEO, SELENIUM_LOG)
}

@js.native
sealed trait TestGridSessionStatus extends js.Any
object TestGridSessionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[TestGridSessionStatus]
  val CLOSED = "CLOSED".asInstanceOf[TestGridSessionStatus]
  val ERRORED = "ERRORED".asInstanceOf[TestGridSessionStatus]

  @inline def values = js.Array(ACTIVE, CLOSED, ERRORED)
}

@js.native
sealed trait TestType extends js.Any
object TestType {
  val BUILTIN_FUZZ = "BUILTIN_FUZZ".asInstanceOf[TestType]
  val BUILTIN_EXPLORER = "BUILTIN_EXPLORER".asInstanceOf[TestType]
  val WEB_PERFORMANCE_PROFILE = "WEB_PERFORMANCE_PROFILE".asInstanceOf[TestType]
  val APPIUM_JAVA_JUNIT = "APPIUM_JAVA_JUNIT".asInstanceOf[TestType]
  val APPIUM_JAVA_TESTNG = "APPIUM_JAVA_TESTNG".asInstanceOf[TestType]
  val APPIUM_PYTHON = "APPIUM_PYTHON".asInstanceOf[TestType]
  val APPIUM_NODE = "APPIUM_NODE".asInstanceOf[TestType]
  val APPIUM_RUBY = "APPIUM_RUBY".asInstanceOf[TestType]
  val APPIUM_WEB_JAVA_JUNIT = "APPIUM_WEB_JAVA_JUNIT".asInstanceOf[TestType]
  val APPIUM_WEB_JAVA_TESTNG = "APPIUM_WEB_JAVA_TESTNG".asInstanceOf[TestType]
  val APPIUM_WEB_PYTHON = "APPIUM_WEB_PYTHON".asInstanceOf[TestType]
  val APPIUM_WEB_NODE = "APPIUM_WEB_NODE".asInstanceOf[TestType]
  val APPIUM_WEB_RUBY = "APPIUM_WEB_RUBY".asInstanceOf[TestType]
  val CALABASH = "CALABASH".asInstanceOf[TestType]
  val INSTRUMENTATION = "INSTRUMENTATION".asInstanceOf[TestType]
  val UIAUTOMATION = "UIAUTOMATION".asInstanceOf[TestType]
  val UIAUTOMATOR = "UIAUTOMATOR".asInstanceOf[TestType]
  val XCTEST = "XCTEST".asInstanceOf[TestType]
  val XCTEST_UI = "XCTEST_UI".asInstanceOf[TestType]
  val REMOTE_ACCESS_RECORD = "REMOTE_ACCESS_RECORD".asInstanceOf[TestType]
  val REMOTE_ACCESS_REPLAY = "REMOTE_ACCESS_REPLAY".asInstanceOf[TestType]

  @inline def values = js.Array(BUILTIN_FUZZ, BUILTIN_EXPLORER, WEB_PERFORMANCE_PROFILE, APPIUM_JAVA_JUNIT, APPIUM_JAVA_TESTNG, APPIUM_PYTHON, APPIUM_NODE, APPIUM_RUBY, APPIUM_WEB_JAVA_JUNIT, APPIUM_WEB_JAVA_TESTNG, APPIUM_WEB_PYTHON, APPIUM_WEB_NODE, APPIUM_WEB_RUBY, CALABASH, INSTRUMENTATION, UIAUTOMATION, UIAUTOMATOR, XCTEST, XCTEST_UI, REMOTE_ACCESS_RECORD, REMOTE_ACCESS_REPLAY)
}

@js.native
sealed trait UploadCategory extends js.Any
object UploadCategory {
  val CURATED = "CURATED".asInstanceOf[UploadCategory]
  val PRIVATE = "PRIVATE".asInstanceOf[UploadCategory]

  @inline def values = js.Array(CURATED, PRIVATE)
}

@js.native
sealed trait UploadStatus extends js.Any
object UploadStatus {
  val INITIALIZED = "INITIALIZED".asInstanceOf[UploadStatus]
  val PROCESSING = "PROCESSING".asInstanceOf[UploadStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[UploadStatus]
  val FAILED = "FAILED".asInstanceOf[UploadStatus]

  @inline def values = js.Array(INITIALIZED, PROCESSING, SUCCEEDED, FAILED)
}

@js.native
sealed trait UploadType extends js.Any
object UploadType {
  val ANDROID_APP = "ANDROID_APP".asInstanceOf[UploadType]
  val IOS_APP = "IOS_APP".asInstanceOf[UploadType]
  val WEB_APP = "WEB_APP".asInstanceOf[UploadType]
  val EXTERNAL_DATA = "EXTERNAL_DATA".asInstanceOf[UploadType]
  val APPIUM_JAVA_JUNIT_TEST_PACKAGE = "APPIUM_JAVA_JUNIT_TEST_PACKAGE".asInstanceOf[UploadType]
  val APPIUM_JAVA_TESTNG_TEST_PACKAGE = "APPIUM_JAVA_TESTNG_TEST_PACKAGE".asInstanceOf[UploadType]
  val APPIUM_PYTHON_TEST_PACKAGE = "APPIUM_PYTHON_TEST_PACKAGE".asInstanceOf[UploadType]
  val APPIUM_NODE_TEST_PACKAGE = "APPIUM_NODE_TEST_PACKAGE".asInstanceOf[UploadType]
  val APPIUM_RUBY_TEST_PACKAGE = "APPIUM_RUBY_TEST_PACKAGE".asInstanceOf[UploadType]
  val APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE = "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE".asInstanceOf[UploadType]
  val APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE = "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE".asInstanceOf[UploadType]
  val APPIUM_WEB_PYTHON_TEST_PACKAGE = "APPIUM_WEB_PYTHON_TEST_PACKAGE".asInstanceOf[UploadType]
  val APPIUM_WEB_NODE_TEST_PACKAGE = "APPIUM_WEB_NODE_TEST_PACKAGE".asInstanceOf[UploadType]
  val APPIUM_WEB_RUBY_TEST_PACKAGE = "APPIUM_WEB_RUBY_TEST_PACKAGE".asInstanceOf[UploadType]
  val CALABASH_TEST_PACKAGE = "CALABASH_TEST_PACKAGE".asInstanceOf[UploadType]
  val INSTRUMENTATION_TEST_PACKAGE = "INSTRUMENTATION_TEST_PACKAGE".asInstanceOf[UploadType]
  val UIAUTOMATION_TEST_PACKAGE = "UIAUTOMATION_TEST_PACKAGE".asInstanceOf[UploadType]
  val UIAUTOMATOR_TEST_PACKAGE = "UIAUTOMATOR_TEST_PACKAGE".asInstanceOf[UploadType]
  val XCTEST_TEST_PACKAGE = "XCTEST_TEST_PACKAGE".asInstanceOf[UploadType]
  val XCTEST_UI_TEST_PACKAGE = "XCTEST_UI_TEST_PACKAGE".asInstanceOf[UploadType]
  val APPIUM_JAVA_JUNIT_TEST_SPEC = "APPIUM_JAVA_JUNIT_TEST_SPEC".asInstanceOf[UploadType]
  val APPIUM_JAVA_TESTNG_TEST_SPEC = "APPIUM_JAVA_TESTNG_TEST_SPEC".asInstanceOf[UploadType]
  val APPIUM_PYTHON_TEST_SPEC = "APPIUM_PYTHON_TEST_SPEC".asInstanceOf[UploadType]
  val APPIUM_NODE_TEST_SPEC = "APPIUM_NODE_TEST_SPEC".asInstanceOf[UploadType]
  val APPIUM_RUBY_TEST_SPEC = "APPIUM_RUBY_TEST_SPEC".asInstanceOf[UploadType]
  val APPIUM_WEB_JAVA_JUNIT_TEST_SPEC = "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC".asInstanceOf[UploadType]
  val APPIUM_WEB_JAVA_TESTNG_TEST_SPEC = "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC".asInstanceOf[UploadType]
  val APPIUM_WEB_PYTHON_TEST_SPEC = "APPIUM_WEB_PYTHON_TEST_SPEC".asInstanceOf[UploadType]
  val APPIUM_WEB_NODE_TEST_SPEC = "APPIUM_WEB_NODE_TEST_SPEC".asInstanceOf[UploadType]
  val APPIUM_WEB_RUBY_TEST_SPEC = "APPIUM_WEB_RUBY_TEST_SPEC".asInstanceOf[UploadType]
  val INSTRUMENTATION_TEST_SPEC = "INSTRUMENTATION_TEST_SPEC".asInstanceOf[UploadType]
  val XCTEST_UI_TEST_SPEC = "XCTEST_UI_TEST_SPEC".asInstanceOf[UploadType]

  @inline def values = js.Array(ANDROID_APP, IOS_APP, WEB_APP, EXTERNAL_DATA, APPIUM_JAVA_JUNIT_TEST_PACKAGE, APPIUM_JAVA_TESTNG_TEST_PACKAGE, APPIUM_PYTHON_TEST_PACKAGE, APPIUM_NODE_TEST_PACKAGE, APPIUM_RUBY_TEST_PACKAGE, APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE, APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE, APPIUM_WEB_PYTHON_TEST_PACKAGE, APPIUM_WEB_NODE_TEST_PACKAGE, APPIUM_WEB_RUBY_TEST_PACKAGE, CALABASH_TEST_PACKAGE, INSTRUMENTATION_TEST_PACKAGE, UIAUTOMATION_TEST_PACKAGE, UIAUTOMATOR_TEST_PACKAGE, XCTEST_TEST_PACKAGE, XCTEST_UI_TEST_PACKAGE, APPIUM_JAVA_JUNIT_TEST_SPEC, APPIUM_JAVA_TESTNG_TEST_SPEC, APPIUM_PYTHON_TEST_SPEC, APPIUM_NODE_TEST_SPEC, APPIUM_RUBY_TEST_SPEC, APPIUM_WEB_JAVA_JUNIT_TEST_SPEC, APPIUM_WEB_JAVA_TESTNG_TEST_SPEC, APPIUM_WEB_PYTHON_TEST_SPEC, APPIUM_WEB_NODE_TEST_SPEC, APPIUM_WEB_RUBY_TEST_SPEC, INSTRUMENTATION_TEST_SPEC, XCTEST_UI_TEST_SPEC)
}

