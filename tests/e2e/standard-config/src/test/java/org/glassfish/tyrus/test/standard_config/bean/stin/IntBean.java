/*
 * Copyright (c) 2011, 2020 Oracle and/or its affiliates. All rights reserved.
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

package org.glassfish.tyrus.test.standard_config.bean.stin;


import jakarta.websocket.OnMessage;
import jakarta.websocket.server.ServerEndpoint;

/**
 * @author Danny Coward (danny.coward at oracle.com)
 */
//    @ServerEndpoint(
//        path="/standardInputTypes/int",
//            Xremote=org.glassfish.tyrus.test.e2e.remote.IntRemote.class
//    )
@ServerEndpoint("/standardInputTypes/int")
public class IntBean {

    @OnMessage
    public String intTest(int i) {
        if (i == 42) {
            return Util.PASS;
        } else {
            return Util.FAIL;
        }
    }

//    @OnMessage(XdynamicPath = "/remote")
//    public void remoteIntTest(String s, IntRemote r) {
//        try {
//            r.sendIntMessage(42);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
