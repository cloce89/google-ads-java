// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/geographic_view_service.proto

package com.google.ads.googleads.v3.services;

public final class GeographicViewServiceProto {
  private GeographicViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetGeographicViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetGeographicViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v3/services/geogr" +
      "aphic_view_service.proto\022 google.ads.goo" +
      "gleads.v3.services\0327google/ads/googleads" +
      "/v3/resources/geographic_view.proto\032\034goo" +
      "gle/api/annotations.proto\032\027google/api/cl" +
      "ient.proto\032\037google/api/field_behavior.pr" +
      "oto\"6\n\030GetGeographicViewRequest\022\032\n\rresou" +
      "rce_name\030\001 \001(\tB\003\340A\0022\204\002\n\025GeographicViewSe" +
      "rvice\022\315\001\n\021GetGeographicView\022:.google.ads" +
      ".googleads.v3.services.GetGeographicView" +
      "Request\0321.google.ads.googleads.v3.resour" +
      "ces.GeographicView\"I\202\323\344\223\0023\0221/v3/{resourc" +
      "e_name=customers/*/geographicViews/*}\332A\r" +
      "resource_name\032\033\312A\030googleads.googleapis.c" +
      "omB\201\002\n$com.google.ads.googleads.v3.servi" +
      "cesB\032GeographicViewServiceProtoP\001ZHgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v3/services;services\242\002\003GAA\252\002 Goog" +
      "le.Ads.GoogleAds.V3.Services\312\002 Google\\Ad" +
      "s\\GoogleAds\\V3\\Services\352\002$Google::Ads::G" +
      "oogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.GeographicViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetGeographicViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetGeographicViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetGeographicViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.GeographicViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
