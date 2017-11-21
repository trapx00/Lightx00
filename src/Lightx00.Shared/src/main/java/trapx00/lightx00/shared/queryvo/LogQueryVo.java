package trapx00.lightx00.shared.queryvo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import trapx00.lightx00.shared.po.log.LogPo;

import java.sql.SQLException;
import java.util.function.Function;
import java.util.function.Predicate;

public class LogQueryVo extends BaseQueryVo<LogPo, Integer> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public LogQueryVo(QueryBuilderPreparation<LogPo, Integer> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public LogQueryVo() {
        super();
    }
}