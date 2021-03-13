package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.MonorailDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.MonoRail;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MonorailDaoImplsSQL implements MonorailDao {
    private final static String namespace = "monorail_mapper";

    @Override
    public MonoRail create(MonoRail o) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public MonoRail getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        MonoRail a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<MonoRail> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<MonoRail> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public MonoRail update(MonoRail o) {
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
