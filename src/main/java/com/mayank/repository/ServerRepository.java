package com.mayank.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mayank.model.Server;
import com.mayank.model.Software;

public class ServerRepository {

	/**
	 * 
	 */
	private Map<Software, List<Server>> softMap = new HashMap<>();

	/**
	 * @param software
	 * @param server
	 */
	public void addToRepo(Software software, Server server) {
		if (this.softMap.get(software) == null) {
			List<Server> list = new ArrayList<>();
			list.add(server);
			this.softMap.put(software, list);
		} else {
			this.softMap.get(software).add(server);
		}
	}

	/**
	 * @return the softMap
	 */
	public Map<Software, List<Server>> getSoftMap() {
		return softMap;
	}

	/**
	 * @param softMap
	 *            the softMap to set
	 */
	public void setSoftMap(Map<Software, List<Server>> softMap) {
		this.softMap = softMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServerRepository [softMap=" + softMap + "]";
	}
}
