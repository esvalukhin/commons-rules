/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/commons-rules
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */ 
 
package com.epam.ta.reportportal.commons.exception.message;

/**
 * Builds custom exception strings from Exception. Lots of exceptions have
 * custom data which should be showed to clients in custom way
 * 
 * @author Andrei Varabyeu
 * 
 */
public interface ExceptionMessageBuilder<T extends Exception> {

	/**
	 * Builds message string from provided exception
	 * 
	 * @param e Exception message should be built from
	 * @return Built message
	 */
	String buildMessage(T e);
}
