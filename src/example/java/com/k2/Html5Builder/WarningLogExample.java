package com.k2.Html5Builder;

import java.util.logging.Logger;

public class WarningLogExample {

	public static void main(String[] args) {
		
		Logger htmlWarningLog = Logger.getLogger("Html5Builder warning log");
		
		Html5Builder hb = new Html5Builder().setWarngingLog(htmlWarningLog);

	}

}
