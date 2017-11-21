package trapx00.lightx00.shared.queryvo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import trapx00.lightx00.shared.po.log.LogPo;

import java.sql.SQLException;
import java.util.function.Function;
import java.util.function.Predicate;

public class LogQueryVo extends BaseQueryVo<LogPo, Integer> {

    public LogQueryVo(QueryBuilderPreparation<LogPo, Integer> preparation) {
        super(preparation);
    }
}