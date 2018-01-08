package com.oreilly.persistence.dao;

import javax.sql.DataSource;

public class JdbcOfficerDAOImpl extends JdbcOfficerDAO {
    public JdbcOfficerDAOImpl(DataSource dataSource) {
        super(dataSource);
    }
}
