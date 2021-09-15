# debezium-sqlserver-jtds-connection-factory

> Notice: Debezium SQL Server Connector doesn't suport connection factory for the moment. See the PR https://github.com/debezium/debezium/pull/2699 for more details.

## Usage

1. Update `build.gradle` to the debezium version you are using. Build the project:

```bash
 ./gradlew clean distTar 
```

2. Unzip the the `.tar` file under `build/distributions`, and move it to debezium sqlserver connector's directory.

3. Use the following configurations (and other normal configurations) to create the connector:

```properties
connector.class=io.debezium.connector.sqlserver.SqlServerConnector
database.domain=ABC.COM
database.connection.factory.class=io.github.zhangyuan.debezium.sqlserver.connection.factory.JtdsConnectionFactory
```
