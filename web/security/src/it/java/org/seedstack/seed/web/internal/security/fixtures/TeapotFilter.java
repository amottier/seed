/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.seed.web.internal.security.fixtures;

import org.apache.shiro.web.filter.PathMatchingFilter;
import org.seedstack.seed.web.SecurityFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Test filters that sends response with 418 code (I'm a teapot)
 */
@SecurityFilter("teapot")
public class TeapotFilter extends PathMatchingFilter {

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        ((HttpServletResponse)response).sendError(418);
        return false;
    }

}
