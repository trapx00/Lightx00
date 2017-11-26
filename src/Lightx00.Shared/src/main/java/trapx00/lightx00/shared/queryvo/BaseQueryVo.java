package trapx00.lightx00.shared.queryvo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import trapx00.lightx00.shared.po.log.LogPo;

import java.sql.SQLException;

public class BaseQueryVo<Po,PK> {
    private QueryBuilderPreparation<Po, PK> preparation;

    /**
     * Sets QueryBuilderPreparation method.
     * @param preparation QueryBuilderPreparation method
     */
    public void setQuery(QueryBuilderPreparation<Po, PK> preparation) {
        this.preparation = preparation;
    }

    /**
     * Gets a PreparedQuery with the DAO parameter.
     * @param dao dao
     * @return prepared query
     * @throws SQLException if the QueryBuilderPreparation were not valid, SQLException would be thrown.
     */
    public PreparedQuery<Po> prepareQuery(Dao<Po, PK> dao) throws SQLException {
        return preparation.prepareQuery(dao.queryBuilder());
    }


    /**
     * Instantiate a QueryVo with prepration method.
     * @param preparation QueryBuilderPreparation method
     */
    public BaseQueryVo(QueryBuilderPreparation<Po, PK> preparation) {
        this.preparation = preparation;
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public BaseQueryVo() {
        preparation = QueryBuilder::prepare;
    }
}
