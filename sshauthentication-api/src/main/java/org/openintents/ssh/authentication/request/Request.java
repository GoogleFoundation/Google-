/*
 * Copyright (C) 2017 Christian Hagau <ach@hagau.se>
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

package org.openintents.ssh.authentication.request;

import android.content.Intent;

public abstract class Request {

    public Intent toIntent() {
        Intent request = new Intent();
        request.setAction(getAction());

        putData(request);

        return request;
    }

    private void populatefromIntent(Intent intent) {
        getData(intent);
    }

    protected abstract void getData(Intent intent);

    protected abstract void putData(Intent request);

    protected abstract String getAction();
}
