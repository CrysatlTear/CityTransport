package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.EngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.Engine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;

import java.util.List;

public class EngineDaoImplSQL implements EngineDao {
    private final static String namespace = "engine_mapper";

    @Override
    public Engine create(Engine o) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public Engine getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        Engine a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<Engine> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<Engine> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public Engine update(Engine o) {
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

    public Engine getByName(String name){
        SqlSession sqlSession = SessionFactory.getSession();
        Engine a = sqlSession.selectOne(namespace + ".getByName", name);
        sqlSession.close();
        return a;
    }
}
