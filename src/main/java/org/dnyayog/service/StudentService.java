package org.dnyayog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyayog.common.DBUtils;

public class StudentService {

	public String getFirstName(String username) {
		try {
			ResultSet rs = DBUtils.executeSelectQuery("select * from user where username='" + username + "'");
			rs.next();
			return rs.getString(2);
		} catch (SQLException e) {
			return "some error occured";
		}
	}

	public String getEmail(String username) {
		try {
			ResultSet rs = DBUtils.executeSelectQuery("select * from user where username='" + username + "'");
			rs.next();
			return rs.getString(3);
		} catch (SQLException e) {
			return "some error occured";
		}
	}

}
