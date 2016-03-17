/*
 * Copyright (C) 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.dataflow.sdk.transforms;

import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

import com.google.cloud.dataflow.sdk.transforms.display.DisplayData;
import com.google.cloud.dataflow.sdk.values.PCollection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link PTransform} base class.
 */
@RunWith(JUnit4.class)
public class PTransformTest {
  @Test
  public void testPopulateDisplayDataDefaultBehavior() {
    PTransform<PCollection<String>, PCollection<String>> transform =
        new PTransform<PCollection<String>, PCollection<String>>() {};
    DisplayData displayData = DisplayData.from(transform);
    assertThat(displayData.items(), empty());
  }
}
