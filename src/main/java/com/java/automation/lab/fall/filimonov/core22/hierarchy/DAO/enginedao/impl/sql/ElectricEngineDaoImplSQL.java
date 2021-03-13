package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.ElecEngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.EngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.ElectricEngine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.Engine;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ElectricEngineDaoImplSQL implements ElecEngineDao {
    private final static String namespace = "elengine_mapper";

    @Override
    public ElectricEngine create(ElectricEngine o) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public ElectricEngine getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        ElectricEngine a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<ElectricEngine> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<ElectricEngine> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public ElectricEngine update(ElectricEngine o) {
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

    public ElectricEngine getByName(String name){
        SqlSession sqlSession = SessionFactory.getSession();
        ElectricEngine a = sqlSession.selectOne(namespace + ".getByName", name);
        sqlSession.close();
        return a;
    }
}
