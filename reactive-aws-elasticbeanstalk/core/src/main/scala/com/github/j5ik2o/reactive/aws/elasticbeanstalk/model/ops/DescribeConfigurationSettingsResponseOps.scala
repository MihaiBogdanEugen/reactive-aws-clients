// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeConfigurationSettingsResponseBuilderOps(val self: DescribeConfigurationSettingsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configurationSettingsAsScala(
      value: Option[Seq[ConfigurationSettingsDescription]]
  ): DescribeConfigurationSettingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.configurationSettings(v.asJava)
    }
  }

}

final class DescribeConfigurationSettingsResponseOps(val self: DescribeConfigurationSettingsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configurationSettingsAsScala: Option[Seq[ConfigurationSettingsDescription]] =
    Option(self.configurationSettings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeConfigurationSettingsResponseOps {

  implicit def toDescribeConfigurationSettingsResponseBuilderOps(
      v: DescribeConfigurationSettingsResponse.Builder
  ): DescribeConfigurationSettingsResponseBuilderOps = new DescribeConfigurationSettingsResponseBuilderOps(v)

  implicit def toDescribeConfigurationSettingsResponseOps(
      v: DescribeConfigurationSettingsResponse
  ): DescribeConfigurationSettingsResponseOps = new DescribeConfigurationSettingsResponseOps(v)

}
