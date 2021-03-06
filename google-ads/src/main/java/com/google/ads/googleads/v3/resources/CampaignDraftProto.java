// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/campaign_draft.proto

package com.google.ads.googleads.v3.resources;

public final class CampaignDraftProto {
  private CampaignDraftProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_CampaignDraft_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_CampaignDraft_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v3/resources/camp" +
      "aign_draft.proto\022!google.ads.googleads.v" +
      "3.resources\0329google/ads/googleads/v3/enu" +
      "ms/campaign_draft_status.proto\032\031google/a" +
      "pi/resource.proto\032\036google/protobuf/wrapp" +
      "ers.proto\032\034google/api/annotations.proto\"" +
      "\245\004\n\rCampaignDraft\022\025\n\rresource_name\030\001 \001(\t" +
      "\022-\n\010draft_id\030\002 \001(\0132\033.google.protobuf.Int" +
      "64Value\0223\n\rbase_campaign\030\003 \001(\0132\034.google." +
      "protobuf.StringValue\022*\n\004name\030\004 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\0224\n\016draft_campai" +
      "gn\030\005 \001(\0132\034.google.protobuf.StringValue\022Z" +
      "\n\006status\030\006 \001(\0162J.google.ads.googleads.v3" +
      ".enums.CampaignDraftStatusEnum.CampaignD" +
      "raftStatus\022:\n\026has_experiment_running\030\007 \001" +
      "(\0132\032.google.protobuf.BoolValue\022<\n\026long_r" +
      "unning_operation\030\010 \001(\0132\034.google.protobuf" +
      ".StringValue:a\352A^\n&googleads.googleapis." +
      "com/CampaignDraft\0224customers/{customer}/" +
      "campaignDrafts/{campaign_draft}B\377\001\n%com." +
      "google.ads.googleads.v3.resourcesB\022Campa" +
      "ignDraftProtoP\001ZJgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v3/resource" +
      "s;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds" +
      ".V3.Resources\312\002!Google\\Ads\\GoogleAds\\V3\\" +
      "Resources\352\002%Google::Ads::GoogleAds::V3::" +
      "Resourcesb\006proto3"
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
          com.google.ads.googleads.v3.enums.CampaignDraftStatusProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_CampaignDraft_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_CampaignDraft_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_CampaignDraft_descriptor,
        new java.lang.String[] { "ResourceName", "DraftId", "BaseCampaign", "Name", "DraftCampaign", "Status", "HasExperimentRunning", "LongRunningOperation", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.CampaignDraftStatusProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
