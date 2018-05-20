package com.mayank.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mayank.constant.Constants;
import com.mayank.model.Server;
import com.mayank.model.Software;
import com.mayank.repository.ServerRepository;

public class ServerInfoService {

	private static ServerRepository serverRepository = new ServerRepository();

	public void populateRepository(String fileName) throws IOException {

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(ServerInfoService::addToRepository);
		}
	}

	public void getOutdatedServer(String fileName) throws IOException {

		Files.delete(Paths.get(fileName));
		StringBuilder sb;

		for (Map.Entry<Software, List<Server>> kv : serverRepository.getSoftMap().entrySet()) {

			Software software = kv.getKey();
			List<Server> servers = kv.getValue();

			if (servers.size() > Constants.INTEGER_ONE) {

				Optional<Server> outdated = servers.stream().min(new ServerComparator());

				sb = new StringBuilder(outdated.get().getServerName()).append(Constants.UPDATE_ARROW)
						.append(software.getSoftwareName()).append(Constants.NEWLINE);

				Files.write(Paths.get(fileName), sb.toString().getBytes(), StandardOpenOption.CREATE,
						StandardOpenOption.APPEND);
			}
		}
	}

	private static void addToRepository(String line) {

		List<String> list = Arrays.stream(line.split(",")).map(mapper -> mapper.trim()).collect(Collectors.toList());

		Server server = new Server();
		server.setServerName(list.get(Constants.INTEGER_ZERO));
		server.setSoftwareVersion(list.get(Constants.INTEGER_THREE));

		Software software = new Software();
		software.setSoftwareType(list.get(Constants.INTEGER_ONE));
		software.setSoftwareName(list.get(Constants.INTEGER_TWO));

		serverRepository.addToRepo(software, server);
	}
}
