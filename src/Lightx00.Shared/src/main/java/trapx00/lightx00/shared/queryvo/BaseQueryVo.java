package trapx00.lightx00.shared.queryvo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import trapx00.lightx00.shared.po.log.LogPo;
import trapx00.lightx00.shared.queryvo.querys.*;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

public class BaseQueryVo<Po,PK> implements Serializable {
    private ArrayList<BaseQuery<Po,PK>> queries = new ArrayList<>();

    public BaseQueryVo<Po,PK> idEq(PK id) {
        queries.add(new IdEq<>(id));
        return this;
    }

    public BaseQueryVo<Po,PK> and() {
        queries.add(new And<>());
        return this;
    }

    public <Obj extends Serializable> BaseQueryVo<Po,PK> between(String columnName, Obj low, Obj high) {
        queries.add(new Between<>(columnName, low, high));
        return this;
    }

    public <Obj extends Serializable>  BaseQueryVo<Po,PK> eq(String columnName, Obj value) {
        queries.add(new Eq<>(columnName, value));
        return this;
    }

    public <Obj extends Serializable>  BaseQueryVo<Po,PK> ge(String columnName, Obj value) {
        queries.add(new Ge<>(columnName, value));
        return this;
    }

    public <Obj extends Serializable>  BaseQueryVo<Po,PK> gt(String columnName, Obj value) {
        queries.add(new Gt<>(columnName, value));
        return this;
    }

    public <Obj extends Serializable>  BaseQueryVo<Po,PK> in(String columnName, ArrayList<Obj> objects) {
        queries.add(new In<>(columnName, objects));
        return this;
    }

    public BaseQueryVo<Po,PK> isNotNull(String columnName) {
        queries.add(new IsNotNull<>(columnName));
        return this;
    }

    public BaseQueryVo<Po,PK> isNull(String columnName) {
        queries.add(new IsNull<>(columnName));
        return this;
    }

    public <Obj extends Serializable> BaseQueryVo<Po,PK> le(String columnName, Obj value) {
        queries.add(new Le<>(columnName, value));
        return this;
    }

    public <Obj extends Serializable> BaseQueryVo<Po,PK> like(String columnName, Obj value) {
        queries.add(new Like<>(columnName, value));
        return this;
    }

    public <Obj extends Serializable> BaseQueryVo<Po,PK> lt(String columnName, Obj value) {
        queries.add(new Lt<>(columnName, value));
        return this;
    }

    public <Obj extends Serializable> BaseQueryVo<Po,PK> ne(String columnName, Obj value) {
        queries.add(new Ne<>(columnName, value));
        return this;
    }

    public BaseQueryVo<Po,PK> not() {
        queries.add(new Not<>());
        return this;
    }

    public <Obj extends Serializable> BaseQueryVo<Po,PK> notIn(String columName, ArrayList<Obj> objects) {
        queries.add(new NotIn<>(columName,objects));
        return this;
    }

    public BaseQueryVo<Po,PK> or() {
        queries.add(new Or<>());
        return this;
    }

    @SuppressWarnings("unchecked")
    public <T extends BaseQueryVo<Po, PK>> T castBack() {
        return (T)this;
    }

    public PreparedQuery<Po> prepareQuery(Dao<Po, PK> dao) throws SQLException {
        if (queries.size() == 0) {
            return dao.queryBuilder().prepare();
        }
        Where<Po, PK> whereClause = dao.queryBuilder().where();
        for (BaseQuery<Po, PK> query : queries) {
            query.execute(whereClause);
        }
        return whereClause.prepare();
    }
}
