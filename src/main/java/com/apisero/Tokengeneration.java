package com.apisero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashSet;

import org.apache.commons.io.FileUtils;

import com.box.sdk.BoxConfig;
import com.box.sdk.BoxDeveloperEditionAPIConnection;

public class Tokengeneration {
	
	public static String name() throws IOException {
		Reader reader = new FileReader("D:\\config.json");
		BoxConfig config = BoxConfig.readFrom(reader);
		BoxDeveloperEditionAPIConnection api = BoxDeveloperEditionAPIConnection.getAppEnterpriseConnection(config);
		//String userId = "793861051";
		//BoxDeveloperEditionAPIConnection api =  BoxDeveloperEditionAPIConnection.getAppUserConnection(userId, config);
		System.out.println("Testing");
		return api.getAccessToken();
	}
	
	
}
