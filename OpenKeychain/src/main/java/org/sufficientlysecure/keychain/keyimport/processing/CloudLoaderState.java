/*
 * Copyright (C) 2017 Schürmann & Breitmoser GbR
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.sufficientlysecure.keychain.keyimport.processing;

import org.sufficientlysecure.keychain.util.Preferences;

public class CloudLoaderState implements LoaderState {

    Preferences.CloudSearchPrefs mCloudPrefs;
    String mServerQuery;

    public CloudLoaderState(String serverQuery, Preferences.CloudSearchPrefs cloudPrefs) {
        mServerQuery = serverQuery;
        mCloudPrefs = cloudPrefs;
    }

    @Override
    public boolean isBasicModeSupported() {
        return false;
    }

}
