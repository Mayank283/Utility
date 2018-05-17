package com.mayank.model;

public class Server {

	private String serverName;

	private String softwareVersion;

	/**
	 * @return the serverName
	 */
	public String getServerName() {
		return serverName;
	}

	/**
	 * @param serverName
	 *            the serverName to set
	 */
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	/**
	 * @return the softwareVersion
	 */
	public String getSoftwareVersion() {
		return softwareVersion;
	}

	/**
	 * @param softwareVersion
	 *            the softwareVersion to set
	 */
	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Server [serverName=" + serverName + ", softwareVersion=" + softwareVersion + "]";
	}
}
