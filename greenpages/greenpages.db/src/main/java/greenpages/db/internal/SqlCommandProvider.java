package greenpages.db.internal;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.util.StringUtils;

/**
 * TODO 2.5 Insert test data via OSGi console
sql:execute DROP TABLE IF EXISTS LISTING

sql:execute CREATE TABLE LISTING(LISTING_NUMBER INT PRIMARY KEY, FIRST_NAME VARCHAR(255), LAST_NAME VARCHAR(255), EMAIL_ADDRESS VARCHAR(255))

sql:execute INSERT INTO LISTING VALUES(1, \'Markus\', \'Knauer\', \'mknauer@eclipsesource.com\')
sql:execute INSERT INTO LISTING VALUES(2, \'Johannes\', \'Eickhold\', \'jeick@eclipsesource.com\')
sql:execute INSERT INTO LISTING VALUES(3, \'Florian\', \'Waibel\', \'fwaibel@eclipsesource.com\')

sql:queryForInt SELECT COUNT(*) FROM LISTING
 */
public class SqlCommandProvider {

	private JdbcOperations jdbcTemplate;

	public void setJdbcTemplate(JdbcOperations jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void execute(String[] args) {
		String sql = StringUtils.arrayToDelimitedString(args, " ");
		// TODO 2.3 Implement SQL commands
	}

	public int queryForInt(String[] args) {
		String sql = StringUtils.arrayToDelimitedString(args, " ");
		// TODO 2.3 Implement SQL commands
		return -1;
	}
}
