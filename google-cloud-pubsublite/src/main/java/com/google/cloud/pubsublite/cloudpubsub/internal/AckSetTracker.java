/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.pubsublite.cloudpubsub.internal;

import com.google.api.core.ApiService;
import com.google.cloud.pubsublite.SequencedMessage;
import com.google.cloud.pubsublite.internal.CheckedApiException;

interface AckSetTracker extends ApiService {
  // Track the given message. Returns a Runnable to ack this message if the message is a valid one
  // to add to the ack set. Must be called with strictly increasing offset messages.
  Runnable track(SequencedMessage message) throws CheckedApiException;

  // Discard all outstanding acks and wait for any pending commit offset to be acknowledged by the
  // server. Throws an exception if the committer shut down due to a permanent error.
  void waitUntilCommitted() throws CheckedApiException;
}
