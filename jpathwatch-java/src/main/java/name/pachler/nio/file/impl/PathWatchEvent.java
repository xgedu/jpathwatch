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

import name.pachler.nio.file.Path;
import name.pachler.nio.file.WatchEvent;
import name.pachler.nio.file.WatchEvent.Kind;

/**
 *
 * @author count
 */
public class PathWatchEvent extends WatchEvent<Path> {

	private int count;
	private Path path;
	private Kind<Path> kind;

	public PathWatchEvent(Kind<Path> kind, Path path, int count) {
		this.kind = kind;
		this.path = path;
		this.count = count;
	}


	@Override
	public Path context() {
		return path;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public Kind<Path> kind() {
		return kind;
	}
	
	@Override
	public String toString() {
		return String.format("{PathWatchEvent kind=%s context='%s' count=%d", kind(), context(), count());
	}
}
