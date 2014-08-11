/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.javaflow.rewrite;

import org.apache.commons.javaflow.Continuation;

public final class SimpleSynchronized implements Runnable {

	public boolean a = false;
	public boolean b = false;
	public boolean c = false;
	public boolean d = false;
	public boolean e = false;
	public boolean f = false;

	private Object o = new Object();
	
	public void run() {		
		a = true;
		Continuation.suspend();
		b = true;
		synchronized(o) {
			c = true;
			Continuation.suspend();
			d = true;
		}
		e = true;
		Continuation.suspend();
		f = true;		
    }

}