/**
 * 
 */
package com.mayank.service;

import java.util.Comparator;

import com.mayank.model.Server;

/**
 * @author mayank
 *
 */
public class ServerComparator implements Comparator<Server> {

	@Override
	public int compare(Server s1, Server s2) {
		String[] v1 = s1.getSoftwareVersion().split("\\.");
		String[] v2 = s2.getSoftwareVersion().split("\\.");
		for (int i = 0; i < v1.length; i++) {
			if (v2[i].compareTo(v1[i]) < 0) {
				return 1;
			}
		}
		return 0;
	}
}