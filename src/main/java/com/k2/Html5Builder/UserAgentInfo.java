package com.k2.Html5Builder;

public class UserAgentInfo {

	public enum UserAgentType {
		MSIE,
		OPERA,
		CHROME,
		FIREFOX,
		SAFARI
	}
	
	private UserAgentType userAgentType;
	private Integer userAgentVersion;

	public UserAgentInfo(UserAgentType userAgentType, Integer userAgentVersion) {
		this.userAgentType = userAgentType;
		this.userAgentVersion = userAgentVersion;
	}
	
	public UserAgentType getType() { return userAgentType; }
	public Integer getVersion() { return userAgentVersion; }

}
