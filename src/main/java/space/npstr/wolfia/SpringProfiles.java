/*
 * Copyright (C) 2016-2020 Dennis Neufeld
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package space.npstr.wolfia;

/**
 * Collect and document the Spring profiles used
 */
public class SpringProfiles {

    /**
     * Test profile is used when executing tests.
     */
    public static final String TEST = "test";
    public static final String NOT_TEST = "!" + TEST;

    /**
     * Enable fake logins for any web request. This is especially useful when developing the dashboard, as it allows
     * local development without having to go through a complicated OAuth2 setup.
     */
    public static final String FAKE_LOGIN = "fake-login";

    private SpringProfiles() {}
}
