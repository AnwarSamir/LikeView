/*
 * Copyright (C) 2016 venshine.cn@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.asi.likeview;

import android.graphics.Color;


public interface IGoodView {

    int DISTANCE = 60;

    int FROM_Y_DELTA = 0;

    int TO_Y_DELTA = DISTANCE;

    float FROM_ALPHA = 1.0f;

    float TO_ALPHA = 0.0f;

    int DURATION = 800;

    String TEXT = "";

    int TEXT_SIZE = 16;

    int TEXT_COLOR = Color.BLACK;

}
