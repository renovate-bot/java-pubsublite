/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.pubsublite.v1.samples;

// [START pubsublite_v1_generated_CursorService_CommitCursor_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.pubsublite.proto.CommitCursorRequest;
import com.google.cloud.pubsublite.proto.CommitCursorResponse;
import com.google.cloud.pubsublite.proto.Cursor;
import com.google.cloud.pubsublite.v1.CursorServiceClient;

public class AsyncCommitCursor {

  public static void main(String[] args) throws Exception {
    asyncCommitCursor();
  }

  public static void asyncCommitCursor() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CursorServiceClient cursorServiceClient = CursorServiceClient.create()) {
      CommitCursorRequest request =
          CommitCursorRequest.newBuilder()
              .setSubscription("subscription341203229")
              .setPartition(-1799810326)
              .setCursor(Cursor.newBuilder().build())
              .build();
      ApiFuture<CommitCursorResponse> future =
          cursorServiceClient.commitCursorCallable().futureCall(request);
      // Do something.
      CommitCursorResponse response = future.get();
    }
  }
}
// [END pubsublite_v1_generated_CursorService_CommitCursor_async]
