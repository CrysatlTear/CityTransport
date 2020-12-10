package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.TramDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Tram;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TramDaoImplSQL implements TramDao {
    private final static String namespace = "tram_mapper";

    @Override
    public Tram create(Tram o) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public Tram getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        Tram a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<Tram> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<Tram> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public Tram update(Tram o) {
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
