/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/common.proto

package com.google.cloud.pubsublite.proto;

public interface SubscriptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.Subscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the subscription.
   * Structured like:
   * projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the subscription.
   * Structured like:
   * projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the topic this subscription is attached to.
   * Structured like:
   * projects/{project_number}/locations/{location}/topics/{topic_id}
   * </pre>
   *
   * <code>string topic = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   *
   *
   * <pre>
   * The name of the topic this subscription is attached to.
   * Structured like:
   * projects/{project_number}/locations/{location}/topics/{topic_id}
   * </pre>
   *
   * <code>string topic = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString getTopicBytes();

  /**
   *
   *
   * <pre>
   * The settings for this subscription's message delivery.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Subscription.DeliveryConfig delivery_config = 3;</code>
   *
   * @return Whether the deliveryConfig field is set.
   */
  boolean hasDeliveryConfig();
  /**
   *
   *
   * <pre>
   * The settings for this subscription's message delivery.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Subscription.DeliveryConfig delivery_config = 3;</code>
   *
   * @return The deliveryConfig.
   */
  com.google.cloud.pubsublite.proto.Subscription.DeliveryConfig getDeliveryConfig();
  /**
   *
   *
   * <pre>
   * The settings for this subscription's message delivery.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Subscription.DeliveryConfig delivery_config = 3;</code>
   */
  com.google.cloud.pubsublite.proto.Subscription.DeliveryConfigOrBuilder
      getDeliveryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * If present, messages are automatically written from the Pub/Sub Lite topic
   * associated with this subscription to a destination.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.ExportConfig export_config = 4;</code>
   *
   * @return Whether the exportConfig field is set.
   */
  boolean hasExportConfig();
  /**
   *
   *
   * <pre>
   * If present, messages are automatically written from the Pub/Sub Lite topic
   * associated with this subscription to a destination.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.ExportConfig export_config = 4;</code>
   *
   * @return The exportConfig.
   */
  com.google.cloud.pubsublite.proto.ExportConfig getExportConfig();
  /**
   *
   *
   * <pre>
   * If present, messages are automatically written from the Pub/Sub Lite topic
   * associated with this subscription to a destination.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.ExportConfig export_config = 4;</code>
   */
  com.google.cloud.pubsublite.proto.ExportConfigOrBuilder getExportConfigOrBuilder();
}
