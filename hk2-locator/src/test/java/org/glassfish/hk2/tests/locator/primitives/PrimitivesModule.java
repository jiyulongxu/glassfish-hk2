/*
 * Copyright (c) 2012, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.hk2.tests.locator.primitives;

import jakarta.inject.Singleton;

import org.glassfish.hk2.api.DynamicConfiguration;
import org.glassfish.hk2.api.PerLookup;
import org.glassfish.hk2.tests.locator.utilities.TestModule;
import org.glassfish.hk2.utilities.BuilderHelper;

/**
 * @author jwells
 *
 */
public class PrimitivesModule implements TestModule {

    /* (non-Javadoc)
     * @see org.glassfish.hk2.tests.locator.utilities.TestModule#configure(org.glassfish.hk2.api.Configuration)
     */
    @Override
    public void configure(DynamicConfiguration config) {
        // char
        config.bind(BuilderHelper.link(Char13Factory.class).
                to(Character.class).
                qualifiedBy(Thirteen.class.getName()).
                in(PerLookup.class.getName()).
                buildFactory(Singleton.class.getName()));
        
        // byte
        config.bind(BuilderHelper.link(Byte13Factory.class).
                to(Byte.class).
                qualifiedBy(Thirteen.class.getName()).
                in(PerLookup.class.getName()).
                buildFactory(Singleton.class.getName()));
        
        config.bind(BuilderHelper.link(Short13Factory.class).
                to(Short.class).
                qualifiedBy(Thirteen.class.getName()).
                in(PerLookup.class.getName()).
                buildFactory(Singleton.class.getName()));
        
        config.bind(BuilderHelper.link(Integer13Factory.class).
                to(Integer.class).
                qualifiedBy(Thirteen.class.getName()).
                in(PerLookup.class.getName()).
                buildFactory(Singleton.class.getName()));
        
        config.bind(BuilderHelper.link(Long13Factory.class).
                to(Long.class).
                qualifiedBy(Thirteen.class.getName()).
                in(PerLookup.class.getName()).
                buildFactory(Singleton.class.getName()));
        
        config.bind(BuilderHelper.link(Double13Factory.class).
                to(Double.class).
                qualifiedBy(Thirteen.class.getName()).
                in(PerLookup.class.getName()).
                buildFactory(Singleton.class.getName()));
        
        config.bind(BuilderHelper.link(Float13Factory.class).
                to(Float.class).
                qualifiedBy(Thirteen.class.getName()).
                in(PerLookup.class.getName()).
                buildFactory(Singleton.class.getName()));       
        
        config.addActiveDescriptor(PrimitiveInjectee.class);
    }

}
