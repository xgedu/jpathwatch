/*
 * Copyright 2008-2011 Uwe Pachler
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

package name.pachler.nio.file.impl;

import name.pachler.nio.file.WatchEvent;
import name.pachler.nio.file.WatchEvent.Kind;

/**
 *
 * @author count
 */
public class VoidWatchEvent extends WatchEvent<Void> {
	
	Kind<Void> kind;

	VoidWatchEvent(Kind<Void> kind){
		this.kind = kind;
	}

	@Override
	public Void context() {
		return null;
	}

	@Override
	public int count() {
		return 1;
	}

	@Override
	public Kind<Void> kind() {
		return kind;
	}

}
