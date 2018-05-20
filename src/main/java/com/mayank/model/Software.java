package com.mayank.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Software {

	/**
	 * 
	 */
	private String softwareName;

	/**
	 * 
	 */
	private String softwareType;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Software software = (Software) obj;

		return new EqualsBuilder().append(this.getSoftwareName(), software.getSoftwareName())
				.append(this.getSoftwareType(), software.getSoftwareType()).isEquals();
	}

	/**
	 * @return the softwareName
	 */
	public String getSoftwareName() {
		return softwareName;
	}

	/**
	 * @return the softwareType
	 */
	public String getSoftwareType() {
		return softwareType;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(softwareName).append(softwareType).toHashCode();
	}

	/**
	 * @param softwareName
	 *            the softwareName to set
	 */
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	/**
	 * @param softwareType
	 *            the softwareType to set
	 */
	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Software [SoftwareType=" + softwareType + ", SoftwareName=" + softwareName + "]";
	}
}
