package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.TramDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.TrolleybusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TramDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TrolleyBusDriver;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class TramDriverDaoImplSQL implements TramDriverDao {

        private final static String namespace = "tramD_mapper";

        @Override
        public TramDriver create(TramDriver o) {
            SqlSession sqlSession = SessionFactory.getSession();
            sqlSession.insert(namespace + ".create", o);
            sqlSession.commit();
            sqlSession.close();
            return o;
        }

        @Override
        public TramDriver getById(Long id) {
            SqlSession sqlSession = SessionFactory.getSession();
            TramDriver a = sqlSession.selectOne(namespace + ".getById", id);
            sqlSession.close();
            return a;
        }

        @Override
        public List<TramDriver> get() {
            SqlSession sqlSession = SessionFactory.getSession();
            List<TramDriver> as = sqlSession.selectList(namespace + ".get");
            sqlSession.close();
            return as;
        }

        @Override
        public TramDriver update(TramDriver o) {
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
