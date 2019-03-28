// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model
<#function targetField fieldDesc>
  <#if fieldDesc.static >
    <#return false>
  </#if>
  <#return true>
</#function>
<#include "common.ftl">

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ${simpleTypeName} => Scala${simpleTypeName}, _ }
import com.amazonaws.services.dynamodbv2.model.{ ${simpleTypeName} => Java${simpleTypeName} }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ${simpleTypeName}Ops {

  implicit class Scala${simpleTypeName}Ops(val self: Scala${simpleTypeName}) extends AnyVal {

    def toJava: Java${simpleTypeName} = {
      val result = new Java${simpleTypeName}()
<#list fields as field>
    <#assign prefix="self." + field.name?replace("type", "`type`")>
    <#if targetField(field)>      <@mapToJava simpleTypeName methods prefix field/></#if></#list>
      result
    }

  }

  implicit class Java${simpleTypeName}Ops(val self: Java${simpleTypeName}) extends AnyVal {

     def toScala: Scala${simpleTypeName} = {
       Scala${simpleTypeName}()
<#list fields as field>
    <#if targetField(field)><@mapToScala simpleTypeName methods field/>
    </#if>
</#list>
     }

   }

}