//========================================================================
//$Id: LifeCycleEvent.java,v 1.1 2004/10/01 14:28:30 gregwilkins Exp $
//Copyright 2004 Mort Bay Consulting Pty. Ltd.
//------------------------------------------------------------------------
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at 
//http://www.apache.org/licenses/LICENSE-2.0
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//========================================================================

package org.browsermob.proxy.jetty.util;

import java.util.EventObject;

// TODO: Auto-generated Javadoc
/**
 * The Class LifeCycleEvent.
 * 
 * @author gregw Event for a LifeCycleListener.
 */
public class LifeCycleEvent extends EventObject {

	/** The cause. */
	Throwable cause;

	/**
	 * Instantiates a new life cycle event.
	 * 
	 * @param source
	 *            the source
	 */
	public LifeCycleEvent(Object source) {
		super(source);
	}

	/**
	 * Instantiates a new life cycle event.
	 * 
	 * @param source
	 *            the source
	 * @param cause
	 *            the cause
	 */
	public LifeCycleEvent(Object source, Throwable cause) {
		super(source);
		this.cause = cause;
	}

	/**
	 * Gets the cause.
	 * 
	 * @return the cause
	 */
	public Throwable getCause() {
		return cause;
	}
}
