// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/ad_group_audience_view_service.proto

package com.google.ads.googleads.v3.services;

public final class AdGroupAudienceViewServiceProto {
  private AdGroupAudienceViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetAdGroupAudienceViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetAdGroupAudienceViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v3/services/ad_gr" +
      "oup_audience_view_service.proto\022 google." +
      "ads.googleads.v3.services\032>google/ads/go" +
      "ogleads/v3/resources/ad_group_audience_v" +
      "iew.proto\032\034google/api/annotations.proto\032" +
      "\027google/api/client.proto\032\037google/api/fie" +
      "ld_behavior.proto\";\n\035GetAdGroupAudienceV" +
      "iewRequest\022\032\n\rresource_name\030\001 \001(\tB\003\340A\0022\235" +
      "\002\n\032AdGroupAudienceViewService\022\341\001\n\026GetAdG" +
      "roupAudienceView\022?.google.ads.googleads." +
      "v3.services.GetAdGroupAudienceViewReques" +
      "t\0326.google.ads.googleads.v3.resources.Ad" +
      "GroupAudienceView\"N\202\323\344\223\0028\0226/v3/{resource" +
      "_name=customers/*/adGroupAudienceViews/*" +
      "}\332A\rresource_name\032\033\312A\030googleads.googleap" +
      "is.comB\206\002\n$com.google.ads.googleads.v3.s" +
      "ervicesB\037AdGroupAudienceViewServiceProto" +
      "P\001ZHgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v3/services;services\242\002\003G" +
      "AA\252\002 Google.Ads.GoogleAds.V3.Services\312\002 " +
      "Google\\Ads\\GoogleAds\\V3\\Services\352\002$Googl" +
      "e::Ads::GoogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.AdGroupAudienceViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetAdGroupAudienceViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetAdGroupAudienceViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetAdGroupAudienceViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.AdGroupAudienceViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
