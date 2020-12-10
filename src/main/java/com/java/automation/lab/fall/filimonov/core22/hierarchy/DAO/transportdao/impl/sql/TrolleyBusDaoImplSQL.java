package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.TramDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.TrolleybusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.TrolleyBus;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TrolleyBusDaoImplSQL implements TrolleybusDao {
    private final static String namespace = "troll_mapper";

    @Override
    public TrolleyBus create(TrolleyBus o) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public TrolleyBus getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        TrolleyBus a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<TrolleyBus> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<TrolleyBus> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public TrolleyBus update(TrolleyBus o) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.update(namespace + ".update", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public Long deleteById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.delete(namespace + ".deleteById", id);
        sqlSession.commit();
        sqlSession.close();
        return null;
    }

}
