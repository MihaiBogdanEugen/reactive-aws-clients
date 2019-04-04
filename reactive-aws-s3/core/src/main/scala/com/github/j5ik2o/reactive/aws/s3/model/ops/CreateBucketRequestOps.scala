// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CreateBucketRequestBuilderOps(val self: CreateBucketRequest.Builder) extends AnyVal {

  final def withAclAsScala(value: Option[BucketCannedACL]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  } // String

  final def withBucketAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withCreateBucketConfigurationAsScala(
      value: Option[CreateBucketConfiguration]
  ): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.createBucketConfiguration(v)
    }
  } // CreateBucketConfiguration

  final def withGrantFullControlAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  } // String

  final def withGrantReadAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  } // String

  final def withGrantReadACPAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  } // String

  final def withGrantWriteAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.grantWrite(v)
    }
  } // String

  final def withGrantWriteACPAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  } // String

  final def withObjectLockEnabledForBucketAsScala(value: Option[Boolean]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockEnabledForBucket(v)
    }
  } // Boolean

}

final class CreateBucketRequestOps(val self: CreateBucketRequest) extends AnyVal {

  final def aclAsScala: Option[BucketCannedACL] = Option(self.acl) // String

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def createBucketConfigurationAsScala: Option[CreateBucketConfiguration] =
    Option(self.createBucketConfiguration) // CreateBucketConfiguration

  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl) // String

  final def grantReadAsScala: Option[String] = Option(self.grantRead) // String

  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP) // String

  final def grantWriteAsScala: Option[String] = Option(self.grantWrite) // String

  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP) // String

  final def objectLockEnabledForBucketAsScala: Option[Boolean] = Option(self.objectLockEnabledForBucket) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateBucketRequestOps {

  implicit def toCreateBucketRequestBuilderOps(v: CreateBucketRequest.Builder): CreateBucketRequestBuilderOps =
    new CreateBucketRequestBuilderOps(v)

  implicit def toCreateBucketRequestOps(v: CreateBucketRequest): CreateBucketRequestOps = new CreateBucketRequestOps(v)

}