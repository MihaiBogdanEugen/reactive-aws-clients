// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketCorsRequestBuilderOps(val self: GetBucketCorsRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): GetBucketCorsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class GetBucketCorsRequestOps(val self: GetBucketCorsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketCorsRequestOps {

  implicit def toGetBucketCorsRequestBuilderOps(v: GetBucketCorsRequest.Builder): GetBucketCorsRequestBuilderOps =
    new GetBucketCorsRequestBuilderOps(v)

  implicit def toGetBucketCorsRequestOps(v: GetBucketCorsRequest): GetBucketCorsRequestOps =
    new GetBucketCorsRequestOps(v)

}