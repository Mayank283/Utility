package com.mayank.main;

import java.io.IOException;

import com.mayank.service.ServerInfoService;

public class Application {

	private static final String inputFileName = "/Users/mayank/eclipse-workspace/Utility/src/main/java/input";
	private static final String outputFileName = "/Users/mayank/eclipse-workspace/Utility/src/main/java/output";

	private static ServerInfoService serverInfoService = new ServerInfoService();

	public static void main(String[] args) throws IOException {
		serverInfoService.populateRepository(inputFileName);
		serverInfoService.getOutdatedServer(outputFileName);
	}
}