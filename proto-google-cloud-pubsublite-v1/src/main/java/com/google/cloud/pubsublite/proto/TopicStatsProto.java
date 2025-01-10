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
// source: google/cloud/pubsublite/v1/topic_stats.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.pubsublite.proto;

public final class TopicStatsProto {
  private TopicStatsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_ComputeHeadCursorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_ComputeHeadCursorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_ComputeHeadCursorResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_ComputeHeadCursorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/pubsublite/v1/topic_stats"
          + ".proto\022\032google.cloud.pubsublite.v1\032\034goog"
          + "le/api/annotations.proto\032\027google/api/cli"
          + "ent.proto\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032\'google/cl"
          + "oud/pubsublite/v1/common.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\336\001\n\032ComputeMessa"
          + "geStatsRequest\0226\n\005topic\030\001 \001(\tB\'\340A\002\372A!\n\037p"
          + "ubsublite.googleapis.com/Topic\022\026\n\tpartit"
          + "ion\030\002 \001(\003B\003\340A\002\0228\n\014start_cursor\030\003 \001(\0132\".g"
          + "oogle.cloud.pubsublite.v1.Cursor\0226\n\nend_"
          + "cursor\030\004 \001(\0132\".google.cloud.pubsublite.v"
          + "1.Cursor\"\275\001\n\033ComputeMessageStatsResponse"
          + "\022\025\n\rmessage_count\030\001 \001(\003\022\025\n\rmessage_bytes"
          + "\030\002 \001(\003\0228\n\024minimum_publish_time\030\003 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\0226\n\022minimum_even"
          + "t_time\030\004 \001(\0132\032.google.protobuf.Timestamp"
          + "\"j\n\030ComputeHeadCursorRequest\0226\n\005topic\030\001 "
          + "\001(\tB\'\340A\002\372A!\n\037pubsublite.googleapis.com/T"
          + "opic\022\026\n\tpartition\030\002 \001(\003B\003\340A\002\"T\n\031ComputeH"
          + "eadCursorResponse\0227\n\013head_cursor\030\001 \001(\0132\""
          + ".google.cloud.pubsublite.v1.Cursor\"\247\001\n\030C"
          + "omputeTimeCursorRequest\0226\n\005topic\030\001 \001(\tB\'"
          + "\340A\002\372A!\n\037pubsublite.googleapis.com/Topic\022"
          + "\026\n\tpartition\030\002 \001(\003B\003\340A\002\022;\n\006target\030\003 \001(\0132"
          + "&.google.cloud.pubsublite.v1.TimeTargetB"
          + "\003\340A\002\"O\n\031ComputeTimeCursorResponse\0222\n\006cur"
          + "sor\030\001 \001(\0132\".google.cloud.pubsublite.v1.C"
          + "ursor2\362\005\n\021TopicStatsService\022\335\001\n\023ComputeM"
          + "essageStats\0226.google.cloud.pubsublite.v1"
          + ".ComputeMessageStatsRequest\0327.google.clo"
          + "ud.pubsublite.v1.ComputeMessageStatsResp"
          + "onse\"U\202\323\344\223\002O\"J/v1/topicStats/{topic=proj"
          + "ects/*/locations/*/topics/*}:computeMess"
          + "ageStats:\001*\022\325\001\n\021ComputeHeadCursor\0224.goog"
          + "le.cloud.pubsublite.v1.ComputeHeadCursor"
          + "Request\0325.google.cloud.pubsublite.v1.Com"
          + "puteHeadCursorResponse\"S\202\323\344\223\002M\"H/v1/topi"
          + "cStats/{topic=projects/*/locations/*/top"
          + "ics/*}:computeHeadCursor:\001*\022\325\001\n\021ComputeT"
          + "imeCursor\0224.google.cloud.pubsublite.v1.C"
          + "omputeTimeCursorRequest\0325.google.cloud.p"
          + "ubsublite.v1.ComputeTimeCursorResponse\"S"
          + "\202\323\344\223\002M\"H/v1/topicStats/{topic=projects/*"
          + "/locations/*/topics/*}:computeTimeCursor"
          + ":\001*\032M\312A\031pubsublite.googleapis.com\322A.http"
          + "s://www.googleapis.com/auth/cloud-platfo"
          + "rmB\320\001\n!com.google.cloud.pubsublite.proto"
          + "B\017TopicStatsProtoP\001Z>cloud.google.com/go"
          + "/pubsublite/apiv1/pubsublitepb;pubsublit"
          + "epb\252\002\032Google.Cloud.PubSubLite.V1\312\002\032Googl"
          + "e\\Cloud\\PubSubLite\\V1\352\002\035Google::Cloud::P"
          + "ubSubLite::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.pubsublite.proto.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsRequest_descriptor,
            new java.lang.String[] {
              "Topic", "Partition", "StartCursor", "EndCursor",
            });
    internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsResponse_descriptor,
            new java.lang.String[] {
              "MessageCount", "MessageBytes", "MinimumPublishTime", "MinimumEventTime",
            });
    internal_static_google_cloud_pubsublite_v1_ComputeHeadCursorRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_pubsublite_v1_ComputeHeadCursorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_ComputeHeadCursorRequest_descriptor,
            new java.lang.String[] {
              "Topic", "Partition",
            });
    internal_static_google_cloud_pubsublite_v1_ComputeHeadCursorResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_pubsublite_v1_ComputeHeadCursorResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_ComputeHeadCursorResponse_descriptor,
            new java.lang.String[] {
              "HeadCursor",
            });
    internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorRequest_descriptor,
            new java.lang.String[] {
              "Topic", "Partition", "Target",
            });
    internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_ComputeTimeCursorResponse_descriptor,
            new java.lang.String[] {
              "Cursor",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.pubsublite.proto.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
