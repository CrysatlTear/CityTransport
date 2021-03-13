package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.enginedao.IcEngineDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.Engine;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.engines.IcEngine;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class IcEngineDaoImplSQL implements IcEngineDao {
    private final static String namespace = "icengine_mapper";

    @Override
    public IcEngine create(IcEngine o) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public IcEngine getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        IcEngine a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<IcEngine> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<IcEngine> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public IcEngine update(IcEngine o) {
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
