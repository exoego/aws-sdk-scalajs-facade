package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object amplifyuibuilder {
  type ComponentBindingProperties = js.Dictionary[ComponentBindingPropertiesValue]
  type ComponentChildList = js.Array[ComponentChild]
  type ComponentCollectionProperties = js.Dictionary[ComponentDataConfiguration]
  type ComponentList = js.Array[Component]
  type ComponentName = String
  type ComponentOverrides = js.Dictionary[ComponentOverridesValue]
  type ComponentOverridesValue = js.Dictionary[String]
  type ComponentProperties = js.Dictionary[ComponentProperty]
  type ComponentPropertyList = js.Array[ComponentProperty]
  type ComponentSummaryList = js.Array[ComponentSummary]
  type ComponentType = String
  type ComponentVariantValues = js.Dictionary[String]
  type ComponentVariants = js.Array[ComponentVariant]
  type FormBindings = js.Dictionary[FormBindingElement]
  type IdentifierList = js.Array[String]
  type ListComponentsLimit = Int
  type ListThemesLimit = Int
  type PredicateList = js.Array[Predicate]
  type SortPropertyList = js.Array[SortProperty]
  type SyntheticExchangeCodeForTokenRequestBodyString = String
  type SyntheticExchangeCodeForTokenResponseString = String
  type SyntheticRefreshTokenRequestBodyString = String
  type SyntheticRefreshTokenResponseString = String
  type SyntheticTimestamp_date_time = js.Date
  type TagKey = String
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type ThemeList = js.Array[Theme]
  type ThemeName = String
  type ThemeSummaryList = js.Array[ThemeSummary]
  type ThemeValuesList = js.Array[ThemeValues]
  type Uuid = String

  final class AmplifyUIBuilderOps(private val service: AmplifyUIBuilder) extends AnyVal {

    @inline def createComponentFuture(params: CreateComponentRequest): Future[CreateComponentResponse] = service.createComponent(params).promise().toFuture
    @inline def createThemeFuture(params: CreateThemeRequest): Future[CreateThemeResponse] = service.createTheme(params).promise().toFuture
    @inline def deleteComponentFuture(params: DeleteComponentRequest): Future[js.Object] = service.deleteComponent(params).promise().toFuture
    @inline def deleteThemeFuture(params: DeleteThemeRequest): Future[js.Object] = service.deleteTheme(params).promise().toFuture
    @inline def exchangeCodeForTokenFuture(params: ExchangeCodeForTokenRequest): Future[ExchangeCodeForTokenResponse] = service.exchangeCodeForToken(params).promise().toFuture
    @inline def exportComponentsFuture(params: ExportComponentsRequest): Future[ExportComponentsResponse] = service.exportComponents(params).promise().toFuture
    @inline def exportThemesFuture(params: ExportThemesRequest): Future[ExportThemesResponse] = service.exportThemes(params).promise().toFuture
    @inline def getComponentFuture(params: GetComponentRequest): Future[GetComponentResponse] = service.getComponent(params).promise().toFuture
    @inline def getThemeFuture(params: GetThemeRequest): Future[GetThemeResponse] = service.getTheme(params).promise().toFuture
    @inline def listComponentsFuture(params: ListComponentsRequest): Future[ListComponentsResponse] = service.listComponents(params).promise().toFuture
    @inline def listThemesFuture(params: ListThemesRequest): Future[ListThemesResponse] = service.listThemes(params).promise().toFuture
    @inline def refreshTokenFuture(params: RefreshTokenRequest): Future[RefreshTokenResponse] = service.refreshToken(params).promise().toFuture
    @inline def updateComponentFuture(params: UpdateComponentRequest): Future[UpdateComponentResponse] = service.updateComponent(params).promise().toFuture
    @inline def updateThemeFuture(params: UpdateThemeRequest): Future[UpdateThemeResponse] = service.updateTheme(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/amplifyuibuilder", JSImport.Namespace, "AWS.AmplifyUIBuilder")
  class AmplifyUIBuilder() extends js.Object {
    def this(config: AWSConfig) = this()

    def createComponent(params: CreateComponentRequest): Request[CreateComponentResponse] = js.native
    def createTheme(params: CreateThemeRequest): Request[CreateThemeResponse] = js.native
    def deleteComponent(params: DeleteComponentRequest): Request[js.Object] = js.native
    def deleteTheme(params: DeleteThemeRequest): Request[js.Object] = js.native
    def exchangeCodeForToken(params: ExchangeCodeForTokenRequest): Request[ExchangeCodeForTokenResponse] = js.native
    def exportComponents(params: ExportComponentsRequest): Request[ExportComponentsResponse] = js.native
    def exportThemes(params: ExportThemesRequest): Request[ExportThemesResponse] = js.native
    def getComponent(params: GetComponentRequest): Request[GetComponentResponse] = js.native
    def getTheme(params: GetThemeRequest): Request[GetThemeResponse] = js.native
    def listComponents(params: ListComponentsRequest): Request[ListComponentsResponse] = js.native
    def listThemes(params: ListThemesRequest): Request[ListThemesResponse] = js.native
    def refreshToken(params: RefreshTokenRequest): Request[RefreshTokenResponse] = js.native
    def updateComponent(params: UpdateComponentRequest): Request[UpdateComponentResponse] = js.native
    def updateTheme(params: UpdateThemeRequest): Request[UpdateThemeResponse] = js.native
  }
  object AmplifyUIBuilder {
    @inline implicit def toOps(service: AmplifyUIBuilder): AmplifyUIBuilderOps = {
      new AmplifyUIBuilderOps(service)
    }
  }

  /** Contains the configuration settings for a user interface (UI) element for an Amplify app. A component is configured as a primary, stand-alone UI element. Use <code>ComponentChild</code> to configure an instance of a <code>Component</code>. A <code>ComponentChild</code> instance inherits the configuration of the main <code>Component</code>.
    */
  @js.native
  trait Component extends js.Object {
    var appId: String
    var bindingProperties: ComponentBindingProperties
    var componentType: ComponentType
    var createdAt: SyntheticTimestamp_date_time
    var environmentName: String
    var id: Uuid
    var name: ComponentName
    var overrides: ComponentOverrides
    var properties: ComponentProperties
    var variants: ComponentVariants
    var children: js.UndefOr[ComponentChildList]
    var collectionProperties: js.UndefOr[ComponentCollectionProperties]
    var modifiedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var sourceId: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
  }

  object Component {
    @inline
    def apply(
        appId: String,
        bindingProperties: ComponentBindingProperties,
        componentType: ComponentType,
        createdAt: SyntheticTimestamp_date_time,
        environmentName: String,
        id: Uuid,
        name: ComponentName,
        overrides: ComponentOverrides,
        properties: ComponentProperties,
        variants: ComponentVariants,
        children: js.UndefOr[ComponentChildList] = js.undefined,
        collectionProperties: js.UndefOr[ComponentCollectionProperties] = js.undefined,
        modifiedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        sourceId: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): Component = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "bindingProperties" -> bindingProperties.asInstanceOf[js.Any],
        "componentType" -> componentType.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "overrides" -> overrides.asInstanceOf[js.Any],
        "properties" -> properties.asInstanceOf[js.Any],
        "variants" -> variants.asInstanceOf[js.Any]
      )

      children.foreach(__v => __obj.updateDynamic("children")(__v.asInstanceOf[js.Any]))
      collectionProperties.foreach(__v => __obj.updateDynamic("collectionProperties")(__v.asInstanceOf[js.Any]))
      modifiedAt.foreach(__v => __obj.updateDynamic("modifiedAt")(__v.asInstanceOf[js.Any]))
      sourceId.foreach(__v => __obj.updateDynamic("sourceId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Component]
    }
  }

  /** Represents the data binding configuration for a component at runtime. You can use <code>ComponentBindingPropertiesValue</code> to add exposed properties to a component to allow different values to be entered when a component is reused in different places in an app.
    */
  @js.native
  trait ComponentBindingPropertiesValue extends js.Object {
    var bindingProperties: js.UndefOr[ComponentBindingPropertiesValueProperties]
    var defaultValue: js.UndefOr[String]
    var `type`: js.UndefOr[String]
  }

  object ComponentBindingPropertiesValue {
    @inline
    def apply(
        bindingProperties: js.UndefOr[ComponentBindingPropertiesValueProperties] = js.undefined,
        defaultValue: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined
    ): ComponentBindingPropertiesValue = {
      val __obj = js.Dynamic.literal()
      bindingProperties.foreach(__v => __obj.updateDynamic("bindingProperties")(__v.asInstanceOf[js.Any]))
      defaultValue.foreach(__v => __obj.updateDynamic("defaultValue")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentBindingPropertiesValue]
    }
  }

  /** Represents the data binding configuration for a specific property using data stored in Amazon Web Services. For Amazon Web Services connected properties, you can bind a property to data stored in an Amazon S3 bucket, an Amplify DataStore model or an authenticated user attribute.
    */
  @js.native
  trait ComponentBindingPropertiesValueProperties extends js.Object {
    var bucket: js.UndefOr[String]
    var defaultValue: js.UndefOr[String]
    var field: js.UndefOr[String]
    var key: js.UndefOr[String]
    var model: js.UndefOr[String]
    var predicates: js.UndefOr[PredicateList]
    var userAttribute: js.UndefOr[String]
  }

  object ComponentBindingPropertiesValueProperties {
    @inline
    def apply(
        bucket: js.UndefOr[String] = js.undefined,
        defaultValue: js.UndefOr[String] = js.undefined,
        field: js.UndefOr[String] = js.undefined,
        key: js.UndefOr[String] = js.undefined,
        model: js.UndefOr[String] = js.undefined,
        predicates: js.UndefOr[PredicateList] = js.undefined,
        userAttribute: js.UndefOr[String] = js.undefined
    ): ComponentBindingPropertiesValueProperties = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      defaultValue.foreach(__v => __obj.updateDynamic("defaultValue")(__v.asInstanceOf[js.Any]))
      field.foreach(__v => __obj.updateDynamic("field")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      model.foreach(__v => __obj.updateDynamic("model")(__v.asInstanceOf[js.Any]))
      predicates.foreach(__v => __obj.updateDynamic("predicates")(__v.asInstanceOf[js.Any]))
      userAttribute.foreach(__v => __obj.updateDynamic("userAttribute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentBindingPropertiesValueProperties]
    }
  }

  /** A nested UI configuration within a parent <code>Component</code>.
    */
  @js.native
  trait ComponentChild extends js.Object {
    var componentType: String
    var name: String
    var properties: ComponentProperties
    var children: js.UndefOr[ComponentChildList]
  }

  object ComponentChild {
    @inline
    def apply(
        componentType: String,
        name: String,
        properties: ComponentProperties,
        children: js.UndefOr[ComponentChildList] = js.undefined
    ): ComponentChild = {
      val __obj = js.Dynamic.literal(
        "componentType" -> componentType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "properties" -> properties.asInstanceOf[js.Any]
      )

      children.foreach(__v => __obj.updateDynamic("children")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentChild]
    }
  }

  /** Represents a conditional expression to set a component property. Use <code>ComponentConditionProperty</code> to set a property to different values conditionally, based on the value of another property.
    */
  @js.native
  trait ComponentConditionProperty extends js.Object {
    var `else`: js.UndefOr[ComponentProperty]
    var field: js.UndefOr[String]
    var operand: js.UndefOr[String]
    var operator: js.UndefOr[String]
    var property: js.UndefOr[String]
    var `then`: js.UndefOr[ComponentProperty]
  }

  object ComponentConditionProperty {
    @inline
    def apply(
        `else`: js.UndefOr[ComponentProperty] = js.undefined,
        field: js.UndefOr[String] = js.undefined,
        operand: js.UndefOr[String] = js.undefined,
        operator: js.UndefOr[String] = js.undefined,
        property: js.UndefOr[String] = js.undefined,
        `then`: js.UndefOr[ComponentProperty] = js.undefined
    ): ComponentConditionProperty = {
      val __obj = js.Dynamic.literal()
      `else`.foreach(__v => __obj.updateDynamic("else")(__v.asInstanceOf[js.Any]))
      field.foreach(__v => __obj.updateDynamic("field")(__v.asInstanceOf[js.Any]))
      operand.foreach(__v => __obj.updateDynamic("operand")(__v.asInstanceOf[js.Any]))
      operator.foreach(__v => __obj.updateDynamic("operator")(__v.asInstanceOf[js.Any]))
      property.foreach(__v => __obj.updateDynamic("property")(__v.asInstanceOf[js.Any]))
      `then`.foreach(__v => __obj.updateDynamic("then")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentConditionProperty]
    }
  }

  /** Describes the configuration for binding a component's properties to data.
    */
  @js.native
  trait ComponentDataConfiguration extends js.Object {
    var model: String
    var identifiers: js.UndefOr[IdentifierList]
    var predicate: js.UndefOr[Predicate]
    var sort: js.UndefOr[SortPropertyList]
  }

  object ComponentDataConfiguration {
    @inline
    def apply(
        model: String,
        identifiers: js.UndefOr[IdentifierList] = js.undefined,
        predicate: js.UndefOr[Predicate] = js.undefined,
        sort: js.UndefOr[SortPropertyList] = js.undefined
    ): ComponentDataConfiguration = {
      val __obj = js.Dynamic.literal(
        "model" -> model.asInstanceOf[js.Any]
      )

      identifiers.foreach(__v => __obj.updateDynamic("identifiers")(__v.asInstanceOf[js.Any]))
      predicate.foreach(__v => __obj.updateDynamic("predicate")(__v.asInstanceOf[js.Any]))
      sort.foreach(__v => __obj.updateDynamic("sort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentDataConfiguration]
    }
  }

  /** Describes the configuration for all of a component's properties. Use <code>ComponentProperty</code> to specify the values to render or bind by default.
    */
  @js.native
  trait ComponentProperty extends js.Object {
    var bindingProperties: js.UndefOr[ComponentPropertyBindingProperties]
    var bindings: js.UndefOr[FormBindings]
    var collectionBindingProperties: js.UndefOr[ComponentPropertyBindingProperties]
    var concat: js.UndefOr[ComponentPropertyList]
    var condition: js.UndefOr[ComponentConditionProperty]
    var configured: js.UndefOr[Boolean]
    var defaultValue: js.UndefOr[String]
    var event: js.UndefOr[String]
    var importedValue: js.UndefOr[String]
    var model: js.UndefOr[String]
    var `type`: js.UndefOr[String]
    var userAttribute: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  object ComponentProperty {
    @inline
    def apply(
        bindingProperties: js.UndefOr[ComponentPropertyBindingProperties] = js.undefined,
        bindings: js.UndefOr[FormBindings] = js.undefined,
        collectionBindingProperties: js.UndefOr[ComponentPropertyBindingProperties] = js.undefined,
        concat: js.UndefOr[ComponentPropertyList] = js.undefined,
        condition: js.UndefOr[ComponentConditionProperty] = js.undefined,
        configured: js.UndefOr[Boolean] = js.undefined,
        defaultValue: js.UndefOr[String] = js.undefined,
        event: js.UndefOr[String] = js.undefined,
        importedValue: js.UndefOr[String] = js.undefined,
        model: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined,
        userAttribute: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): ComponentProperty = {
      val __obj = js.Dynamic.literal()
      bindingProperties.foreach(__v => __obj.updateDynamic("bindingProperties")(__v.asInstanceOf[js.Any]))
      bindings.foreach(__v => __obj.updateDynamic("bindings")(__v.asInstanceOf[js.Any]))
      collectionBindingProperties.foreach(__v => __obj.updateDynamic("collectionBindingProperties")(__v.asInstanceOf[js.Any]))
      concat.foreach(__v => __obj.updateDynamic("concat")(__v.asInstanceOf[js.Any]))
      condition.foreach(__v => __obj.updateDynamic("condition")(__v.asInstanceOf[js.Any]))
      configured.foreach(__v => __obj.updateDynamic("configured")(__v.asInstanceOf[js.Any]))
      defaultValue.foreach(__v => __obj.updateDynamic("defaultValue")(__v.asInstanceOf[js.Any]))
      event.foreach(__v => __obj.updateDynamic("event")(__v.asInstanceOf[js.Any]))
      importedValue.foreach(__v => __obj.updateDynamic("importedValue")(__v.asInstanceOf[js.Any]))
      model.foreach(__v => __obj.updateDynamic("model")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      userAttribute.foreach(__v => __obj.updateDynamic("userAttribute")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentProperty]
    }
  }

  /** Associates a component property to a binding property. This enables exposed properties on the top level component to propagate data to the component's property values.
    */
  @js.native
  trait ComponentPropertyBindingProperties extends js.Object {
    var property: String
    var field: js.UndefOr[String]
  }

  object ComponentPropertyBindingProperties {
    @inline
    def apply(
        property: String,
        field: js.UndefOr[String] = js.undefined
    ): ComponentPropertyBindingProperties = {
      val __obj = js.Dynamic.literal(
        "property" -> property.asInstanceOf[js.Any]
      )

      field.foreach(__v => __obj.updateDynamic("field")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentPropertyBindingProperties]
    }
  }

  /** Contains a summary of a component. This is a read-only data type that is returned by <code>ListComponents</code>.
    */
  @js.native
  trait ComponentSummary extends js.Object {
    var appId: String
    var componentType: ComponentType
    var environmentName: String
    var id: Uuid
    var name: ComponentName
  }

  object ComponentSummary {
    @inline
    def apply(
        appId: String,
        componentType: ComponentType,
        environmentName: String,
        id: Uuid,
        name: ComponentName
    ): ComponentSummary = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "componentType" -> componentType.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ComponentSummary]
    }
  }

  /** Describes the style configuration of a unique variation of a main component.
    */
  @js.native
  trait ComponentVariant extends js.Object {
    var overrides: js.UndefOr[ComponentOverrides]
    var variantValues: js.UndefOr[ComponentVariantValues]
  }

  object ComponentVariant {
    @inline
    def apply(
        overrides: js.UndefOr[ComponentOverrides] = js.undefined,
        variantValues: js.UndefOr[ComponentVariantValues] = js.undefined
    ): ComponentVariant = {
      val __obj = js.Dynamic.literal()
      overrides.foreach(__v => __obj.updateDynamic("overrides")(__v.asInstanceOf[js.Any]))
      variantValues.foreach(__v => __obj.updateDynamic("variantValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentVariant]
    }
  }

  /** Represents all of the information that is required to create a component.
    */
  @js.native
  trait CreateComponentData extends js.Object {
    var bindingProperties: ComponentBindingProperties
    var componentType: ComponentType
    var name: ComponentName
    var overrides: ComponentOverrides
    var properties: ComponentProperties
    var variants: ComponentVariants
    var children: js.UndefOr[ComponentChildList]
    var collectionProperties: js.UndefOr[ComponentCollectionProperties]
    var sourceId: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
  }

  object CreateComponentData {
    @inline
    def apply(
        bindingProperties: ComponentBindingProperties,
        componentType: ComponentType,
        name: ComponentName,
        overrides: ComponentOverrides,
        properties: ComponentProperties,
        variants: ComponentVariants,
        children: js.UndefOr[ComponentChildList] = js.undefined,
        collectionProperties: js.UndefOr[ComponentCollectionProperties] = js.undefined,
        sourceId: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateComponentData = {
      val __obj = js.Dynamic.literal(
        "bindingProperties" -> bindingProperties.asInstanceOf[js.Any],
        "componentType" -> componentType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "overrides" -> overrides.asInstanceOf[js.Any],
        "properties" -> properties.asInstanceOf[js.Any],
        "variants" -> variants.asInstanceOf[js.Any]
      )

      children.foreach(__v => __obj.updateDynamic("children")(__v.asInstanceOf[js.Any]))
      collectionProperties.foreach(__v => __obj.updateDynamic("collectionProperties")(__v.asInstanceOf[js.Any]))
      sourceId.foreach(__v => __obj.updateDynamic("sourceId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateComponentData]
    }
  }

  @js.native
  trait CreateComponentRequest extends js.Object {
    var appId: String
    var componentToCreate: CreateComponentData
    var environmentName: String
    var clientToken: js.UndefOr[String]
  }

  object CreateComponentRequest {
    @inline
    def apply(
        appId: String,
        componentToCreate: CreateComponentData,
        environmentName: String,
        clientToken: js.UndefOr[String] = js.undefined
    ): CreateComponentRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "componentToCreate" -> componentToCreate.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateComponentRequest]
    }
  }

  @js.native
  trait CreateComponentResponse extends js.Object {
    var entity: js.UndefOr[Component]
  }

  object CreateComponentResponse {
    @inline
    def apply(
        entity: js.UndefOr[Component] = js.undefined
    ): CreateComponentResponse = {
      val __obj = js.Dynamic.literal()
      entity.foreach(__v => __obj.updateDynamic("entity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateComponentResponse]
    }
  }

  /** Represents all of the information that is required to create a theme.
    */
  @js.native
  trait CreateThemeData extends js.Object {
    var name: ThemeName
    var values: ThemeValuesList
    var overrides: js.UndefOr[ThemeValuesList]
    var tags: js.UndefOr[Tags]
  }

  object CreateThemeData {
    @inline
    def apply(
        name: ThemeName,
        values: ThemeValuesList,
        overrides: js.UndefOr[ThemeValuesList] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateThemeData = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )

      overrides.foreach(__v => __obj.updateDynamic("overrides")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThemeData]
    }
  }

  @js.native
  trait CreateThemeRequest extends js.Object {
    var appId: String
    var environmentName: String
    var themeToCreate: CreateThemeData
    var clientToken: js.UndefOr[String]
  }

  object CreateThemeRequest {
    @inline
    def apply(
        appId: String,
        environmentName: String,
        themeToCreate: CreateThemeData,
        clientToken: js.UndefOr[String] = js.undefined
    ): CreateThemeRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "themeToCreate" -> themeToCreate.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThemeRequest]
    }
  }

  @js.native
  trait CreateThemeResponse extends js.Object {
    var entity: js.UndefOr[Theme]
  }

  object CreateThemeResponse {
    @inline
    def apply(
        entity: js.UndefOr[Theme] = js.undefined
    ): CreateThemeResponse = {
      val __obj = js.Dynamic.literal()
      entity.foreach(__v => __obj.updateDynamic("entity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThemeResponse]
    }
  }

  @js.native
  trait DeleteComponentRequest extends js.Object {
    var appId: String
    var environmentName: String
    var id: Uuid
  }

  object DeleteComponentRequest {
    @inline
    def apply(
        appId: String,
        environmentName: String,
        id: Uuid
    ): DeleteComponentRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteComponentRequest]
    }
  }

  @js.native
  trait DeleteThemeRequest extends js.Object {
    var appId: String
    var environmentName: String
    var id: Uuid
  }

  object DeleteThemeRequest {
    @inline
    def apply(
        appId: String,
        environmentName: String,
        id: Uuid
    ): DeleteThemeRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteThemeRequest]
    }
  }

  @js.native
  trait ExchangeCodeForTokenRequest extends js.Object {
    var provider: TokenProviders
    var request: ExchangeCodeForTokenRequestBody
  }

  object ExchangeCodeForTokenRequest {
    @inline
    def apply(
        provider: TokenProviders,
        request: ExchangeCodeForTokenRequestBody
    ): ExchangeCodeForTokenRequest = {
      val __obj = js.Dynamic.literal(
        "provider" -> provider.asInstanceOf[js.Any],
        "request" -> request.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExchangeCodeForTokenRequest]
    }
  }

  /** Describes the configuration of a request to exchange an access code for a token.
    */
  @js.native
  trait ExchangeCodeForTokenRequestBody extends js.Object {
    var code: SyntheticExchangeCodeForTokenRequestBodyString
    var redirectUri: String
  }

  object ExchangeCodeForTokenRequestBody {
    @inline
    def apply(
        code: SyntheticExchangeCodeForTokenRequestBodyString,
        redirectUri: String
    ): ExchangeCodeForTokenRequestBody = {
      val __obj = js.Dynamic.literal(
        "code" -> code.asInstanceOf[js.Any],
        "redirectUri" -> redirectUri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExchangeCodeForTokenRequestBody]
    }
  }

  @js.native
  trait ExchangeCodeForTokenResponse extends js.Object {
    var accessToken: SyntheticExchangeCodeForTokenResponseString
    var expiresIn: Int
    var refreshToken: SyntheticExchangeCodeForTokenResponseString
  }

  object ExchangeCodeForTokenResponse {
    @inline
    def apply(
        accessToken: SyntheticExchangeCodeForTokenResponseString,
        expiresIn: Int,
        refreshToken: SyntheticExchangeCodeForTokenResponseString
    ): ExchangeCodeForTokenResponse = {
      val __obj = js.Dynamic.literal(
        "accessToken" -> accessToken.asInstanceOf[js.Any],
        "expiresIn" -> expiresIn.asInstanceOf[js.Any],
        "refreshToken" -> refreshToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExchangeCodeForTokenResponse]
    }
  }

  @js.native
  trait ExportComponentsRequest extends js.Object {
    var appId: String
    var environmentName: String
  }

  object ExportComponentsRequest {
    @inline
    def apply(
        appId: String,
        environmentName: String
    ): ExportComponentsRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportComponentsRequest]
    }
  }

  @js.native
  trait ExportComponentsResponse extends js.Object {
    var entities: ComponentList
  }

  object ExportComponentsResponse {
    @inline
    def apply(
        entities: ComponentList
    ): ExportComponentsResponse = {
      val __obj = js.Dynamic.literal(
        "entities" -> entities.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportComponentsResponse]
    }
  }

  @js.native
  trait ExportThemesRequest extends js.Object {
    var appId: String
    var environmentName: String
  }

  object ExportThemesRequest {
    @inline
    def apply(
        appId: String,
        environmentName: String
    ): ExportThemesRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportThemesRequest]
    }
  }

  @js.native
  trait ExportThemesResponse extends js.Object {
    var entities: ThemeList
  }

  object ExportThemesResponse {
    @inline
    def apply(
        entities: ThemeList
    ): ExportThemesResponse = {
      val __obj = js.Dynamic.literal(
        "entities" -> entities.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportThemesResponse]
    }
  }

  /** Describes how to bind a component property to form data.
    */
  @js.native
  trait FormBindingElement extends js.Object {
    var element: String
    var property: String
  }

  object FormBindingElement {
    @inline
    def apply(
        element: String,
        property: String
    ): FormBindingElement = {
      val __obj = js.Dynamic.literal(
        "element" -> element.asInstanceOf[js.Any],
        "property" -> property.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FormBindingElement]
    }
  }

  @js.native
  trait GetComponentRequest extends js.Object {
    var appId: String
    var environmentName: String
    var id: Uuid
  }

  object GetComponentRequest {
    @inline
    def apply(
        appId: String,
        environmentName: String,
        id: Uuid
    ): GetComponentRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetComponentRequest]
    }
  }

  @js.native
  trait GetComponentResponse extends js.Object {
    var component: js.UndefOr[Component]
  }

  object GetComponentResponse {
    @inline
    def apply(
        component: js.UndefOr[Component] = js.undefined
    ): GetComponentResponse = {
      val __obj = js.Dynamic.literal()
      component.foreach(__v => __obj.updateDynamic("component")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComponentResponse]
    }
  }

  @js.native
  trait GetThemeRequest extends js.Object {
    var appId: String
    var environmentName: String
    var id: Uuid
  }

  object GetThemeRequest {
    @inline
    def apply(
        appId: String,
        environmentName: String,
        id: Uuid
    ): GetThemeRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetThemeRequest]
    }
  }

  @js.native
  trait GetThemeResponse extends js.Object {
    var theme: js.UndefOr[Theme]
  }

  object GetThemeResponse {
    @inline
    def apply(
        theme: js.UndefOr[Theme] = js.undefined
    ): GetThemeResponse = {
      val __obj = js.Dynamic.literal()
      theme.foreach(__v => __obj.updateDynamic("theme")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetThemeResponse]
    }
  }

  @js.native
  trait ListComponentsRequest extends js.Object {
    var appId: String
    var environmentName: String
    var maxResults: js.UndefOr[ListComponentsLimit]
    var nextToken: js.UndefOr[String]
  }

  object ListComponentsRequest {
    @inline
    def apply(
        appId: String,
        environmentName: String,
        maxResults: js.UndefOr[ListComponentsLimit] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListComponentsRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentsRequest]
    }
  }

  @js.native
  trait ListComponentsResponse extends js.Object {
    var entities: ComponentSummaryList
    var nextToken: js.UndefOr[String]
  }

  object ListComponentsResponse {
    @inline
    def apply(
        entities: ComponentSummaryList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListComponentsResponse = {
      val __obj = js.Dynamic.literal(
        "entities" -> entities.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentsResponse]
    }
  }

  @js.native
  trait ListThemesRequest extends js.Object {
    var appId: String
    var environmentName: String
    var maxResults: js.UndefOr[ListThemesLimit]
    var nextToken: js.UndefOr[String]
  }

  object ListThemesRequest {
    @inline
    def apply(
        appId: String,
        environmentName: String,
        maxResults: js.UndefOr[ListThemesLimit] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListThemesRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThemesRequest]
    }
  }

  @js.native
  trait ListThemesResponse extends js.Object {
    var entities: ThemeSummaryList
    var nextToken: js.UndefOr[String]
  }

  object ListThemesResponse {
    @inline
    def apply(
        entities: ThemeSummaryList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListThemesResponse = {
      val __obj = js.Dynamic.literal(
        "entities" -> entities.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThemesResponse]
    }
  }

  /** Stores information for generating Amplify DataStore queries. Use a <code>Predicate</code> to retrieve a subset of the data in a collection.
    */
  @js.native
  trait Predicate extends js.Object {
    var and: js.UndefOr[PredicateList]
    var field: js.UndefOr[String]
    var operand: js.UndefOr[String]
    var operator: js.UndefOr[String]
    var or: js.UndefOr[PredicateList]
  }

  object Predicate {
    @inline
    def apply(
        and: js.UndefOr[PredicateList] = js.undefined,
        field: js.UndefOr[String] = js.undefined,
        operand: js.UndefOr[String] = js.undefined,
        operator: js.UndefOr[String] = js.undefined,
        or: js.UndefOr[PredicateList] = js.undefined
    ): Predicate = {
      val __obj = js.Dynamic.literal()
      and.foreach(__v => __obj.updateDynamic("and")(__v.asInstanceOf[js.Any]))
      field.foreach(__v => __obj.updateDynamic("field")(__v.asInstanceOf[js.Any]))
      operand.foreach(__v => __obj.updateDynamic("operand")(__v.asInstanceOf[js.Any]))
      operator.foreach(__v => __obj.updateDynamic("operator")(__v.asInstanceOf[js.Any]))
      or.foreach(__v => __obj.updateDynamic("or")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Predicate]
    }
  }

  @js.native
  trait RefreshTokenRequest extends js.Object {
    var provider: TokenProviders
    var refreshTokenBody: RefreshTokenRequestBody
  }

  object RefreshTokenRequest {
    @inline
    def apply(
        provider: TokenProviders,
        refreshTokenBody: RefreshTokenRequestBody
    ): RefreshTokenRequest = {
      val __obj = js.Dynamic.literal(
        "provider" -> provider.asInstanceOf[js.Any],
        "refreshTokenBody" -> refreshTokenBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RefreshTokenRequest]
    }
  }

  /** Describes a refresh token.
    */
  @js.native
  trait RefreshTokenRequestBody extends js.Object {
    var token: SyntheticRefreshTokenRequestBodyString
  }

  object RefreshTokenRequestBody {
    @inline
    def apply(
        token: SyntheticRefreshTokenRequestBodyString
    ): RefreshTokenRequestBody = {
      val __obj = js.Dynamic.literal(
        "token" -> token.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RefreshTokenRequestBody]
    }
  }

  @js.native
  trait RefreshTokenResponse extends js.Object {
    var accessToken: SyntheticRefreshTokenResponseString
    var expiresIn: Int
  }

  object RefreshTokenResponse {
    @inline
    def apply(
        accessToken: SyntheticRefreshTokenResponseString,
        expiresIn: Int
    ): RefreshTokenResponse = {
      val __obj = js.Dynamic.literal(
        "accessToken" -> accessToken.asInstanceOf[js.Any],
        "expiresIn" -> expiresIn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RefreshTokenResponse]
    }
  }

  /** Describes how to sort the data that you bind to a component.
    */
  @js.native
  trait SortProperty extends js.Object {
    var direction: SortDirection
    var field: String
  }

  object SortProperty {
    @inline
    def apply(
        direction: SortDirection,
        field: String
    ): SortProperty = {
      val __obj = js.Dynamic.literal(
        "direction" -> direction.asInstanceOf[js.Any],
        "field" -> field.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SortProperty]
    }
  }

  /** A theme is a collection of style settings that apply globally to the components associated with an Amplify application.
    */
  @js.native
  trait Theme extends js.Object {
    var appId: String
    var createdAt: SyntheticTimestamp_date_time
    var environmentName: String
    var id: Uuid
    var name: ThemeName
    var values: ThemeValuesList
    var modifiedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var overrides: js.UndefOr[ThemeValuesList]
    var tags: js.UndefOr[Tags]
  }

  object Theme {
    @inline
    def apply(
        appId: String,
        createdAt: SyntheticTimestamp_date_time,
        environmentName: String,
        id: Uuid,
        name: ThemeName,
        values: ThemeValuesList,
        modifiedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        overrides: js.UndefOr[ThemeValuesList] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): Theme = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )

      modifiedAt.foreach(__v => __obj.updateDynamic("modifiedAt")(__v.asInstanceOf[js.Any]))
      overrides.foreach(__v => __obj.updateDynamic("overrides")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Theme]
    }
  }

  /** Describes the basic information about a theme.
    */
  @js.native
  trait ThemeSummary extends js.Object {
    var appId: String
    var environmentName: String
    var id: Uuid
    var name: ThemeName
  }

  object ThemeSummary {
    @inline
    def apply(
        appId: String,
        environmentName: String,
        id: Uuid,
        name: ThemeName
    ): ThemeSummary = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ThemeSummary]
    }
  }

  /** Describes the configuration of a theme's properties.
    */
  @js.native
  trait ThemeValue extends js.Object {
    var children: js.UndefOr[ThemeValuesList]
    var value: js.UndefOr[String]
  }

  object ThemeValue {
    @inline
    def apply(
        children: js.UndefOr[ThemeValuesList] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): ThemeValue = {
      val __obj = js.Dynamic.literal()
      children.foreach(__v => __obj.updateDynamic("children")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThemeValue]
    }
  }

  /** A key-value pair that defines a property of a theme.
    */
  @js.native
  trait ThemeValues extends js.Object {
    var key: js.UndefOr[String]
    var value: js.UndefOr[ThemeValue]
  }

  object ThemeValues {
    @inline
    def apply(
        key: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[ThemeValue] = js.undefined
    ): ThemeValues = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThemeValues]
    }
  }

  /** Updates and saves all of the information about a component, based on component ID.
    */
  @js.native
  trait UpdateComponentData extends js.Object {
    var bindingProperties: js.UndefOr[ComponentBindingProperties]
    var children: js.UndefOr[ComponentChildList]
    var collectionProperties: js.UndefOr[ComponentCollectionProperties]
    var componentType: js.UndefOr[ComponentType]
    var id: js.UndefOr[Uuid]
    var name: js.UndefOr[ComponentName]
    var overrides: js.UndefOr[ComponentOverrides]
    var properties: js.UndefOr[ComponentProperties]
    var sourceId: js.UndefOr[String]
    var variants: js.UndefOr[ComponentVariants]
  }

  object UpdateComponentData {
    @inline
    def apply(
        bindingProperties: js.UndefOr[ComponentBindingProperties] = js.undefined,
        children: js.UndefOr[ComponentChildList] = js.undefined,
        collectionProperties: js.UndefOr[ComponentCollectionProperties] = js.undefined,
        componentType: js.UndefOr[ComponentType] = js.undefined,
        id: js.UndefOr[Uuid] = js.undefined,
        name: js.UndefOr[ComponentName] = js.undefined,
        overrides: js.UndefOr[ComponentOverrides] = js.undefined,
        properties: js.UndefOr[ComponentProperties] = js.undefined,
        sourceId: js.UndefOr[String] = js.undefined,
        variants: js.UndefOr[ComponentVariants] = js.undefined
    ): UpdateComponentData = {
      val __obj = js.Dynamic.literal()
      bindingProperties.foreach(__v => __obj.updateDynamic("bindingProperties")(__v.asInstanceOf[js.Any]))
      children.foreach(__v => __obj.updateDynamic("children")(__v.asInstanceOf[js.Any]))
      collectionProperties.foreach(__v => __obj.updateDynamic("collectionProperties")(__v.asInstanceOf[js.Any]))
      componentType.foreach(__v => __obj.updateDynamic("componentType")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      overrides.foreach(__v => __obj.updateDynamic("overrides")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      sourceId.foreach(__v => __obj.updateDynamic("sourceId")(__v.asInstanceOf[js.Any]))
      variants.foreach(__v => __obj.updateDynamic("variants")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateComponentData]
    }
  }

  @js.native
  trait UpdateComponentRequest extends js.Object {
    var appId: String
    var environmentName: String
    var id: Uuid
    var updatedComponent: UpdateComponentData
    var clientToken: js.UndefOr[String]
  }

  object UpdateComponentRequest {
    @inline
    def apply(
        appId: String,
        environmentName: String,
        id: Uuid,
        updatedComponent: UpdateComponentData,
        clientToken: js.UndefOr[String] = js.undefined
    ): UpdateComponentRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "updatedComponent" -> updatedComponent.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateComponentRequest]
    }
  }

  @js.native
  trait UpdateComponentResponse extends js.Object {
    var entity: js.UndefOr[Component]
  }

  object UpdateComponentResponse {
    @inline
    def apply(
        entity: js.UndefOr[Component] = js.undefined
    ): UpdateComponentResponse = {
      val __obj = js.Dynamic.literal()
      entity.foreach(__v => __obj.updateDynamic("entity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateComponentResponse]
    }
  }

  /** Saves the data binding information for a theme.
    */
  @js.native
  trait UpdateThemeData extends js.Object {
    var values: ThemeValuesList
    var id: js.UndefOr[Uuid]
    var name: js.UndefOr[ThemeName]
    var overrides: js.UndefOr[ThemeValuesList]
  }

  object UpdateThemeData {
    @inline
    def apply(
        values: ThemeValuesList,
        id: js.UndefOr[Uuid] = js.undefined,
        name: js.UndefOr[ThemeName] = js.undefined,
        overrides: js.UndefOr[ThemeValuesList] = js.undefined
    ): UpdateThemeData = {
      val __obj = js.Dynamic.literal(
        "values" -> values.asInstanceOf[js.Any]
      )

      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      overrides.foreach(__v => __obj.updateDynamic("overrides")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThemeData]
    }
  }

  @js.native
  trait UpdateThemeRequest extends js.Object {
    var appId: String
    var environmentName: String
    var id: Uuid
    var updatedTheme: UpdateThemeData
    var clientToken: js.UndefOr[String]
  }

  object UpdateThemeRequest {
    @inline
    def apply(
        appId: String,
        environmentName: String,
        id: Uuid,
        updatedTheme: UpdateThemeData,
        clientToken: js.UndefOr[String] = js.undefined
    ): UpdateThemeRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "updatedTheme" -> updatedTheme.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThemeRequest]
    }
  }

  @js.native
  trait UpdateThemeResponse extends js.Object {
    var entity: js.UndefOr[Theme]
  }

  object UpdateThemeResponse {
    @inline
    def apply(
        entity: js.UndefOr[Theme] = js.undefined
    ): UpdateThemeResponse = {
      val __obj = js.Dynamic.literal()
      entity.foreach(__v => __obj.updateDynamic("entity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThemeResponse]
    }
  }
}
