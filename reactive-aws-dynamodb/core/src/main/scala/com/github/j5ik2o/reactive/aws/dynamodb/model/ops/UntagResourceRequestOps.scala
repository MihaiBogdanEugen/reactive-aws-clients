// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UntagResourceRequestBuilderOps(val self: UntagResourceRequest.Builder) extends AnyVal {

  final def withResourceArnAsScala(value: Option[String]): UntagResourceRequest.Builder = {
    value.fold(self) { v =>
      self.resourceArn(v)
    }
  } // String

  final def withTagKeysAsScala(value: Option[Seq[String]]): UntagResourceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagKeys(v.asJava)
    } // Seq[String]
  }

}

final class UntagResourceRequestOps(val self: UntagResourceRequest) extends AnyVal {

  final def resourceArnAsScala: Option[String] = Option(self.resourceArn) // String

  final def tagKeysAsScala: Option[Seq[String]] = Option(self.tagKeys).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUntagResourceRequestOps {

  implicit def toUntagResourceRequestBuilderOps(v: UntagResourceRequest.Builder): UntagResourceRequestBuilderOps =
    new UntagResourceRequestBuilderOps(v)

  implicit def toUntagResourceRequestOps(v: UntagResourceRequest): UntagResourceRequestOps =
    new UntagResourceRequestOps(v)

}