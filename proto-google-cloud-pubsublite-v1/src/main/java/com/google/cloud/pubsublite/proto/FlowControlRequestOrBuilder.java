/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/pubsublite/v1/subscriber.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.pubsublite.proto;

public interface FlowControlRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.FlowControlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The number of message tokens to grant. Must be greater than or equal to 0.
   * </pre>
   *
   * <code>int64 allowed_messages = 1;</code>
   *
   * @return The allowedMessages.
   */
  long getAllowedMessages();

  /**
   *
   *
   * <pre>
   * The number of byte tokens to grant. Must be greater than or equal to 0.
   * </pre>
   *
   * <code>int64 allowed_bytes = 2;</code>
   *
   * @return The allowedBytes.
   */
  long getAllowedBytes();
}
