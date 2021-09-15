# debezium-sqlserver-jtds-connection-factory

## Usage

1. Update `build.gradle` to the debezium version you are using. Build the project:

```bash
 ./gradlew clean distTar 
```

2. Unzip the the `.tar` file under `build/distributions`, and move it to debezium sqlserver connector's directory.

3. Use the following configuration to create the connector:

```properties
connector.class=io.debezium.connector.sqlserver.SqlServerConnector
database.domain=ABC.COM
database.connection.factory.class=io.github.zhangyuan.debezium.sqlserver.connection.factory.JtdsConnectionFactory
```
