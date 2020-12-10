package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.CityTransportDAO;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.CityTransport;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CityTransportDaoImplSQL implements CityTransportDAO {
    private final static String namespace = "tr_mapper";

    @Override
    public CityTransport create(CityTransport o) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public CityTransport getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        CityTransport a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<CityTransport> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<CityTransport> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public CityTransport update(CityTransport o) {
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
