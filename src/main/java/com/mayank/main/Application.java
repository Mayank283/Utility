package com.mayank.main;

import java.io.IOException;

import com.mayank.service.ServerInfoService;

public class Application {

	private static final String fileName = "/Users/mayank/eclipse-workspace/Utilty/src/main/java/input";

	static ServerInfoService serverInfoService = new ServerInfoService();

	public static void main(String[] args) throws IOException {

		serverInfoService.populateRepository(fileName);
	}
}