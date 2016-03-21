/**
 * 
 */
package com.poc.customAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author nverma
 *
 */
@Retention(RetentionPolicy.SOURCE)
public @interface CustomLogger {
	
	public int logLevel();

}
