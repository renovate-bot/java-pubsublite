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

public interface SeekRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.SeekRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A named target.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
   *
   * @return Whether the namedTarget field is set.
   */
  boolean hasNamedTarget();
  /**
   *
   *
   * <pre>
   * A named target.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
   *
   * @return The enum numeric value on the wire for namedTarget.
   */
  int getNamedTargetValue();
  /**
   *
   *
   * <pre>
   * A named target.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
   *
   * @return The namedTarget.
   */
  com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget getNamedTarget();

  /**
   *
   *
   * <pre>
   * A target corresponding to the cursor, pointing to anywhere in the
   * topic partition.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
   *
   * @return Whether the cursor field is set.
   */
  boolean hasCursor();
  /**
   *
   *
   * <pre>
   * A target corresponding to the cursor, pointing to anywhere in the
   * topic partition.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
   *
   * @return The cursor.
   */
  com.google.cloud.pubsublite.proto.Cursor getCursor();
  /**
   *
   *
   * <pre>
   * A target corresponding to the cursor, pointing to anywhere in the
   * topic partition.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
   */
  com.google.cloud.pubsublite.proto.CursorOrBuilder getCursorOrBuilder();

  com.google.cloud.pubsublite.proto.SeekRequest.TargetCase getTargetCase();
}
