package com.test.sp;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class StartTest {
	@Autowired
	BasicDataSource dbs;
	
	@Test
	public void test() {
		Connection conn = null;
		try {
			conn = dbs.getConnection();
			assertNotNull(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
