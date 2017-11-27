package trapx00.lightx00.shared.queryvo;

import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;

public interface QueryBuilderPreparation<Po,PK> {
    PreparedQuery<Po> prepareQuery(QueryBuilder<Po,PK> queryBuilder) throws SQLException;
}
