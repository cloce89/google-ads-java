// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/dynamic_search_ads_search_term_view.proto

package com.google.ads.googleads.v3.resources;

public interface DynamicSearchAdsSearchTermViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.DynamicSearchAdsSearchTermView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the dynamic search ads search term view.
   * Dynamic search ads search term view resource names have the form:
   * `customers/{customer_id}/dynamicSearchAdsSearchTermViews/{ad_group_id}~{search_term_fp}~{headline_fp}~{landing_page_fp}~{page_url_fp}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the dynamic search ads search term view.
   * Dynamic search ads search term view resource names have the form:
   * `customers/{customer_id}/dynamicSearchAdsSearchTermViews/{ad_group_id}~{search_term_fp}~{headline_fp}~{landing_page_fp}~{page_url_fp}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Search term
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  boolean hasSearchTerm();
  /**
   * <pre>
   * Search term
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  com.google.protobuf.StringValue getSearchTerm();
  /**
   * <pre>
   * Search term
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getSearchTermOrBuilder();

  /**
   * <pre>
   * The dynamically generated headline of the Dynamic Search Ad.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 3;</code>
   */
  boolean hasHeadline();
  /**
   * <pre>
   * The dynamically generated headline of the Dynamic Search Ad.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 3;</code>
   */
  com.google.protobuf.StringValue getHeadline();
  /**
   * <pre>
   * The dynamically generated headline of the Dynamic Search Ad.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getHeadlineOrBuilder();

  /**
   * <pre>
   * The dynamically selected landing page URL of the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue landing_page = 4;</code>
   */
  boolean hasLandingPage();
  /**
   * <pre>
   * The dynamically selected landing page URL of the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue landing_page = 4;</code>
   */
  com.google.protobuf.StringValue getLandingPage();
  /**
   * <pre>
   * The dynamically selected landing page URL of the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue landing_page = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLandingPageOrBuilder();

  /**
   * <pre>
   * The URL of page feed item served for the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue page_url = 5;</code>
   */
  boolean hasPageUrl();
  /**
   * <pre>
   * The URL of page feed item served for the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue page_url = 5;</code>
   */
  com.google.protobuf.StringValue getPageUrl();
  /**
   * <pre>
   * The URL of page feed item served for the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue page_url = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPageUrlOrBuilder();

  /**
   * <pre>
   * True if query matches a negative keyword.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_keyword = 6;</code>
   */
  boolean hasHasNegativeKeyword();
  /**
   * <pre>
   * True if query matches a negative keyword.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_keyword = 6;</code>
   */
  com.google.protobuf.BoolValue getHasNegativeKeyword();
  /**
   * <pre>
   * True if query matches a negative keyword.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_keyword = 6;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasNegativeKeywordOrBuilder();

  /**
   * <pre>
   * True if query is added to targeted keywords.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_matching_keyword = 7;</code>
   */
  boolean hasHasMatchingKeyword();
  /**
   * <pre>
   * True if query is added to targeted keywords.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_matching_keyword = 7;</code>
   */
  com.google.protobuf.BoolValue getHasMatchingKeyword();
  /**
   * <pre>
   * True if query is added to targeted keywords.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_matching_keyword = 7;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasMatchingKeywordOrBuilder();

  /**
   * <pre>
   * True if query matches a negative url.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_url = 8;</code>
   */
  boolean hasHasNegativeUrl();
  /**
   * <pre>
   * True if query matches a negative url.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_url = 8;</code>
   */
  com.google.protobuf.BoolValue getHasNegativeUrl();
  /**
   * <pre>
   * True if query matches a negative url.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_url = 8;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasNegativeUrlOrBuilder();
}
