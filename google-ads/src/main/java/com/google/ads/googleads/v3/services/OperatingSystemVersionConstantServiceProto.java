// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/operating_system_version_constant_service.proto

package com.google.ads.googleads.v3.services;

public final class OperatingSystemVersionConstantServiceProto {
  private OperatingSystemVersionConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetOperatingSystemVersionConstantRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetOperatingSystemVersionConstantRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nPgoogle/ads/googleads/v3/services/opera" +
      "ting_system_version_constant_service.pro" +
      "to\022 google.ads.googleads.v3.services\032Igo" +
      "ogle/ads/googleads/v3/resources/operatin" +
      "g_system_version_constant.proto\032\034google/" +
      "api/annotations.proto\032\027google/api/client" +
      ".proto\032\037google/api/field_behavior.proto\"" +
      "F\n(GetOperatingSystemVersionConstantRequ" +
      "est\022\032\n\rresource_name\030\001 \001(\tB\003\340A\0022\310\002\n%Oper" +
      "atingSystemVersionConstantService\022\201\002\n!Ge" +
      "tOperatingSystemVersionConstant\022J.google" +
      ".ads.googleads.v3.services.GetOperatingS" +
      "ystemVersionConstantRequest\032A.google.ads" +
      ".googleads.v3.resources.OperatingSystemV" +
      "ersionConstant\"M\202\323\344\223\0027\0225/v3/{resource_na" +
      "me=operatingSystemVersionConstants/*}\332A\r" +
      "resource_name\032\033\312A\030googleads.googleapis.c" +
      "omB\221\002\n$com.google.ads.googleads.v3.servi" +
      "cesB*OperatingSystemVersionConstantServi" +
      "ceProtoP\001ZHgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v3/services;servi" +
      "ces\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Serv" +
      "ices\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352" +
      "\002$Google::Ads::GoogleAds::V3::Servicesb\006" +
      "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.resources.OperatingSystemVersionConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetOperatingSystemVersionConstantRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetOperatingSystemVersionConstantRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetOperatingSystemVersionConstantRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.OperatingSystemVersionConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
