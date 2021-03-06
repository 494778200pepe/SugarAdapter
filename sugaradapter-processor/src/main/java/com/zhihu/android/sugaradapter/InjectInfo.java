/*
 * Copyright 2018 Zhihu Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zhihu.android.sugaradapter;

import androidx.annotation.NonNull;

class InjectInfo {
    private String mViewName;
    private String mViewType;
    private String mViewIdStr;

    InjectInfo(@NonNull String viewName, @NonNull String viewType, @NonNull String viewIdStr) {
        mViewName = viewName;
        mViewType = viewType;
        mViewIdStr = viewIdStr;
    }

    @NonNull
    String getViewName() {
        return mViewName;
    }

    @NonNull
    String getViewType() {
        return mViewType;
    }

    @NonNull
    String getViewIdStr() {
        return mViewIdStr;
    }
}
