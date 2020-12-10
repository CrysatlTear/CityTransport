package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.UndergroundDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.MonoRail;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Underground;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UndergroundDaoImplSQL implements UndergroundDao {
    private final static String namespace = "train_mapper";

    @Override
    public Underground create(Underground o) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public Underground getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        Underground a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<Underground> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<Underground> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public Underground update(Underground o) {
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
