package io.github.zhangyuan.debezium.sqlserver.connection.factory;

import io.debezium.connector.sqlserver.SqlServerConnectorConfig;
import io.debezium.jdbc.JdbcConfiguration;
import io.debezium.jdbc.JdbcConnection;
import net.sourceforge.jtds.jdbc.Driver;
import net.sourceforge.jtds.jdbc.JtdsConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class JtdsConnectionFactory implements JdbcConnection.ConnectionFactory {
    private static final String URL_PATTERN = "jdbc:jtds:sqlserver://${" + JdbcConfiguration.HOSTNAME + "}:${" + JdbcConfiguration.PORT + "};databaseName=${"
            + JdbcConfiguration.DATABASE + "}";

    JdbcConnection.ConnectionFactory factory = JdbcConnection.patternBasedFactory(URL_PATTERN,
            Driver.class.getName(),
            JtdsConnection.class.getClassLoader(),
            JdbcConfiguration.PORT.withDefault(SqlServerConnectorConfig.PORT.defaultValueAsString()));

    @Override
    public Connection connect(JdbcConfiguration config) throws SQLException {
        return factory.connect(config);
    }
}
