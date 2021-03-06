// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateReservedInstancesListingResponseBuilderOps(val self: CreateReservedInstancesListingResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesListingsAsScala(
      value: Option[Seq[ReservedInstancesListing]]
  ): CreateReservedInstancesListingResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservedInstancesListings(v.asJava)
    }
  }

}

final class CreateReservedInstancesListingResponseOps(val self: CreateReservedInstancesListingResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesListingsAsScala: Option[Seq[ReservedInstancesListing]] =
    Option(self.reservedInstancesListings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateReservedInstancesListingResponseOps {

  implicit def toCreateReservedInstancesListingResponseBuilderOps(
      v: CreateReservedInstancesListingResponse.Builder
  ): CreateReservedInstancesListingResponseBuilderOps = new CreateReservedInstancesListingResponseBuilderOps(v)

  implicit def toCreateReservedInstancesListingResponseOps(
      v: CreateReservedInstancesListingResponse
  ): CreateReservedInstancesListingResponseOps = new CreateReservedInstancesListingResponseOps(v)

}
