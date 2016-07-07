package org.nishant;

import org.apache.commons.lang.StringUtils;

public class StringUtilsUsage {

	public boolean blankString(String param) {
		return StringUtils.isBlank(param);
	}

	public boolean notBlankString(String param) {
		return StringUtils.isNotBlank(param);
	}
}