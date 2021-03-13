package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.UndergroundDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TramDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.UndergroundDriver;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TrainDriverDaoImplSQL implements UndergroundDriverDao {
    private final static String namespace = "trainD_mapper";

    @Override
    public UndergroundDriver create(UndergroundDriver o) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public UndergroundDriver getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        UndergroundDriver a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<UndergroundDriver> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<UndergroundDriver> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public UndergroundDriver update(UndergroundDriver o) {
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
        return id;
    }
}
