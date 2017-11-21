package trapx00.lightx00.shared.queryvo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.PreparedQuery;
import trapx00.lightx00.shared.po.log.LogPo;

import java.sql.SQLException;

public class BaseQueryVo<Po,PK> {
    private QueryBuilderPreparation<Po, PK> preparation;

    public void setQuery(QueryBuilderPreparation<Po, PK> preparation) {
        this.preparation = preparation;
    }

    public PreparedQuery<Po> getQueryBuilder(Dao<Po, PK> dao) throws SQLException {
        return preparation.prepareQuery(dao.queryBuilder());
    }

    public BaseQueryVo(QueryBuilderPreparation<Po, PK> preparation) {
        this.preparation = preparation;
    }
}
