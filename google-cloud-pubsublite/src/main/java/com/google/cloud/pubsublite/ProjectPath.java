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

package com.google.cloud.pubsublite;

import static com.google.cloud.pubsublite.internal.UncheckedApiPreconditions.checkArgument;

import com.google.api.gax.rpc.ApiException;
import com.google.auto.value.AutoValue;
import java.io.Serializable;

/** A string wrapper representing a project. */
@AutoValue
public abstract class ProjectPath implements Serializable {
  public abstract ProjectIdOrNumber project();

  @Override
  public String toString() {
    return "projects/" + project();
  }

  /** Create a new ProjectPath builder. */
  public static Builder newBuilder() {
    return new AutoValue_ProjectPath.Builder();
  }

  public abstract Builder toBuilder();

  @AutoValue.Builder
  public abstract static class Builder extends ProjectBuilderHelper<Builder> {
    public abstract ProjectPath build();
  }

  /**
   * Parse a project path. Should be structured like:
   *
   * <p>projects/&lt;project number&gt;
   */
  public static ProjectPath parse(String path) throws ApiException {
    String[] splits = path.split("/");
    checkArgument(splits.length == 2);
    checkArgument(splits[0].equals("projects"));
    checkArgument(!splits[1].isEmpty());
    try {
      long val = Long.parseLong(splits[1]);
      return ProjectPath.newBuilder().setProject(ProjectNumber.of(val)).build();
    } catch (NumberFormatException e) {
      // Pass, treat as a name. Project ids must start with a letter.
      // https://cloud.google.com/resource-manager/docs/creating-managing-projects#before_you_begin
    }
    return ProjectPath.newBuilder().setProject(ProjectId.of(splits[1])).build();
  }
}
