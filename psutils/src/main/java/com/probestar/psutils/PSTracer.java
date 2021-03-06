/**
 *
 * Copyright (c) 2015
 * All rights reserved.
 *
 * @Title PSTracer.java
 * @Package com.probestar.psutils
 * @author WangYanwei
 * @Email wangyanwei@feinno.com
 * @QQ 344137375
 * @date 2015年6月9日 上午10:45:59
 * @version V1.0
 * @Description 
 *
 */

package com.probestar.psutils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PSTracer {
	static {
		try {
			PropertyConfigurator.configure("log4j.properties");
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private Logger _tracer;

	public static PSTracer getInstance(Class<?> c) {
		return new PSTracer(c);
	}

	public PSTracer(Class<?> c) {
		_tracer = Logger.getLogger(c);
	}

	public void debug(String debug) {
		_tracer.debug(debug);
	}

	public void debug(String debug, Object... args) {
		_tracer.debug(String.format(debug, args));
	}

	public void info(String info) {
		_tracer.info(info);
	}

	public void info(String info, Object... args) {
		_tracer.info(String.format(info, args));
	}

	public void warn(String warn) {
		_tracer.warn(warn);
	}

	public void warn(String warn, Object... args) {
		_tracer.warn(String.format(warn, args));
	}

	public void warn(String warn, Throwable t) {
		_tracer.warn(warn, t);
	}

	public void error(String error) {
		_tracer.error(error);
	}

	public void error(String error, Object... args) {
		_tracer.error(String.format(error, args));
	}

	public void error(String error, Throwable t) {
		_tracer.error(error, t);
	}

	public void fatal(String fatal) {
		_tracer.fatal(fatal);
	}

	public void fatal(String fatal, Object... args) {
		_tracer.fatal(String.format(fatal, args));
	}

	public void fatal(String fatal, Throwable t) {
		_tracer.fatal(fatal, t);
	}
}
