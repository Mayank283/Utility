package com.mayank.model;

public class Software {

	private String SoftwareName;

	private String SoftwareType;

	@Override
	public boolean equals(Object software) {
		return true;
	}

	/**
	 * @return the softwareName
	 */
	public String getSoftwareName() {
		return SoftwareName;
	}

	/**
	 * @return the softwareType
	 */
	public String getSoftwareType() {
		return SoftwareType;
	}

	@Override
	public int hashCode() {
		return 0;
	}

	/**
	 * @param softwareName
	 *            the softwareName to set
	 */
	public void setSoftwareName(String softwareName) {
		SoftwareName = softwareName;
	}

	/**
	 * @param softwareType
	 *            the softwareType to set
	 */
	public void setSoftwareType(String softwareType) {
		SoftwareType = softwareType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Software [SoftwareType=" + SoftwareType + ", SoftwareName=" + SoftwareName + "]";
	}
}
