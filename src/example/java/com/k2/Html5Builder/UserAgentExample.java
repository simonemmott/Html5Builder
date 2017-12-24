package com.k2.Html5Builder;

import com.k2.Html5Builder.UserAgentInfo.UserAgentType;

public class UserAgentExample {

	public static void main(String[] args) {
		
		UserAgentInfo uaInfo = new UserAgentInfo(UserAgentType.CHROME, 32);
		
		Html5Builder hb = new Html5Builder().setUAgentInfo(uaInfo);

	}

}
