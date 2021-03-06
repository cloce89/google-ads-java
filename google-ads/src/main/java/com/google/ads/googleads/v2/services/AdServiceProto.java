// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/ad_service.proto

package com.google.ads.googleads.v2.services;

public final class AdServiceProto {
  private AdServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetAdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetAdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateAdsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateAdsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_AdOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_AdOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateAdsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateAdsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateAdResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateAdResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v2/services/ad_se" +
      "rvice.proto\022 google.ads.googleads.v2.ser" +
      "vices\032*google/ads/googleads/v2/resources" +
      "/ad.proto\032\034google/api/annotations.proto\032" +
      " google/protobuf/field_mask.proto\032\027googl" +
      "e/api/client.proto\"%\n\014GetAdRequest\022\025\n\rre" +
      "source_name\030\001 \001(\t\"j\n\020MutateAdsRequest\022\023\n" +
      "\013customer_id\030\001 \001(\t\022A\n\noperations\030\002 \003(\0132-" +
      ".google.ads.googleads.v2.services.AdOper" +
      "ation\"\204\001\n\013AdOperation\022/\n\013update_mask\030\002 \001" +
      "(\0132\032.google.protobuf.FieldMask\0227\n\006update" +
      "\030\001 \001(\0132%.google.ads.googleads.v2.resourc" +
      "es.AdH\000B\013\n\toperation\"V\n\021MutateAdsRespons" +
      "e\022A\n\007results\030\002 \003(\01320.google.ads.googlead" +
      "s.v2.services.MutateAdResult\"\'\n\016MutateAd" +
      "Result\022\025\n\rresource_name\030\001 \001(\t2\344\002\n\tAdServ" +
      "ice\022\215\001\n\005GetAd\022..google.ads.googleads.v2." +
      "services.GetAdRequest\032%.google.ads.googl" +
      "eads.v2.resources.Ad\"-\202\323\344\223\002\'\022%/v2/{resou" +
      "rce_name=customers/*/ads/*}\022\251\001\n\tMutateAd" +
      "s\0222.google.ads.googleads.v2.services.Mut" +
      "ateAdsRequest\0323.google.ads.googleads.v2." +
      "services.MutateAdsResponse\"3\202\323\344\223\002-\"(/v2/" +
      "customers/{customer_id=*}/ads:mutate:\001*\032" +
      "\033\312A\030googleads.googleapis.comB\365\001\n$com.goo" +
      "gle.ads.googleads.v2.servicesB\016AdService" +
      "ProtoP\001ZHgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v2/services;service" +
      "s\242\002\003GAA\252\002 Google.Ads.GoogleAds.V2.Servic" +
      "es\312\002 Google\\Ads\\GoogleAds\\V2\\Services\352\002$" +
      "Google::Ads::GoogleAds::V2::Servicesb\006pr" +
      "oto3"
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
          com.google.ads.googleads.v2.resources.AdProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetAdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetAdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetAdRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateAdsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateAdsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateAdsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v2_services_AdOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_AdOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_AdOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateAdsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateAdsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateAdsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v2_services_MutateAdResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateAdResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateAdResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.AdProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
