package com.mayank.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mayank.model.Server;
import com.mayank.model.Software;
import com.mayank.repository.ServerRepository;

public class ServerInfoService {

	private static ServerRepository serverRepository = new ServerRepository();

	public void populateRepository(String fileName) throws IOException {

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(value -> {
				String[] str = value.split(",");
				List<String> list = Arrays.stream(str).map(mapper -> mapper.trim()).collect(Collectors.toList());
				Server server = new Server();
				server.setServerName(list.get(0));
				server.setSoftwareVersion(list.get(3));
				Software software = new Software();
				software.setSoftwareType(list.get(1));
				software.setSoftwareName(list.get(2));
				serverRepository.addToRepo(software, server);
			});
		}

		System.out.println(serverRepository);
	}

	public List<String> getOutdatedServer() {
		//ToDo
		return null;
	}
}
