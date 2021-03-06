package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.BusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.MonorailDriverlDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.UndergroundDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.BusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.MonorailTrainDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.UndergroundDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.MonoRail;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class MonorailDriverDaoImplSQL implements UndergroundDriverDao {

        private final static String namespace = "monorailD_mapper";

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
