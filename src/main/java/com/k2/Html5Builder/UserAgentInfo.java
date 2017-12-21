package com.k2.Html5Builder;

/**
 * This class encapsulates the information identifying the user agent
 * 
 * @author simon
 *
 */
public class UserAgentInfo {

	/**
	 * The broad type of the user agent
	 * 
	 * @author simon
	 *
	 */
	public enum UserAgentType {
		/**
		 * Microsoft Internet Explorer
		 */
		MSIE,
		/**
		 * Opera browsers
		 */
		OPERA,
		/**
		 * Chrome browsers
		 */
		CHROME,
		/**
		 * Firefox browsers
		 */
		FIREFOX,
		/**
		 * Safari browsers
		 */
		SAFARI
	}
	
	private UserAgentType userAgentType;
	private Integer userAgentVersion;
	
	/**
	 * Create the user agent info record specifying the user agent type and version
	 * @param userAgentType	The type of the user agent
	 * @param userAgentVersion	The version of the user agent
	 */
	public UserAgentInfo(UserAgentType userAgentType, Integer userAgentVersion) {
		this.userAgentType = userAgentType;
		this.userAgentVersion = userAgentVersion;
	}
	
	/**
	 * Get the type of this user agent
	 * 
	 * @return The type of this user agent
	 */
	public UserAgentType getType() { return userAgentType; }
	/**
	 * Get the version of this user agent
	 * 
	 * @return The version of this user agent
	 */
	public Integer getVersion() { return userAgentVersion; }

}
