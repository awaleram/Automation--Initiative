// Copyright (c) 2005 Brian Wellington (bwelling@xbill.org)

package org.xbill.DNS.spi;

import sun.net.spi.nameservice.NameService;
import sun.net.spi.nameservice.NameServiceDescriptor;

import java.lang.reflect.Proxy;

// TODO: Auto-generated Javadoc
/**
 * The descriptor class for the dnsjava name service provider.
 * 
 * @author Brian Wellington
 * @author Paul Cowan (pwc21@yahoo.com)
 */

public class DNSJavaNameServiceDescriptor implements NameServiceDescriptor {

	/** The name service. */
	private static NameService nameService;

	static {
		nameService = (NameService) Proxy.newProxyInstance(
				NameService.class.getClassLoader(),
				new Class[] { NameService.class }, new DNSJavaNameService());
	}

	/**
	 * Returns a reference to a dnsjava name server provider.
	 * 
	 * @return the name service
	 */
	public NameService createNameService() {
		return nameService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sun.net.spi.nameservice.NameServiceDescriptor#getType()
	 */
	public String getType() {
		return "dns";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sun.net.spi.nameservice.NameServiceDescriptor#getProviderName()
	 */
	public String getProviderName() {
		return "dnsjava";
	}

}
