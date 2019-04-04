// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class KeySchemaElementBuilderOps(val self: KeySchemaElement.Builder) extends AnyVal {

  final def withAttributeNameAsScala(value: Option[String]): KeySchemaElement.Builder = {
    value.fold(self) { v =>
      self.attributeName(v)
    }
  } // String

  final def withKeyTypeAsScala(value: Option[KeyType]): KeySchemaElement.Builder = {
    value.fold(self) { v =>
      self.keyType(v)
    }
  } // String

}

final class KeySchemaElementOps(val self: KeySchemaElement) extends AnyVal {

  final def attributeNameAsScala: Option[String] = Option(self.attributeName) // String

  final def keyTypeAsScala: Option[KeyType] = Option(self.keyType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeySchemaElementOps {

  implicit def toKeySchemaElementBuilderOps(v: KeySchemaElement.Builder): KeySchemaElementBuilderOps =
    new KeySchemaElementBuilderOps(v)

  implicit def toKeySchemaElementOps(v: KeySchemaElement): KeySchemaElementOps = new KeySchemaElementOps(v)

}