/*
 * Copyright 2008-2013 Steven Swor
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation. This particular file is
 * subject to the "Classpath" exception as provided in the LICENSE file
 * that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 */
package name.pachler.nio.file.test.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

/**
 * A JUL logging handler configured to dump log output to {@link System#out}.
 * @author Steven Swor
 */
public class TestHandler extends ConsoleHandler {

    /**
     * Creates a new TestHandler.
     */
    public TestHandler() {
        super();
        setOutputStream(System.out);
        setLevel(Level.ALL);
    }
}
