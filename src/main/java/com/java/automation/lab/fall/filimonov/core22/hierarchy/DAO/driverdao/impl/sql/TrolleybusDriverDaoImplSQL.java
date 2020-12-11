package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.BusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.TrolleybusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.BusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.TrolleyBusDriver;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class TrolleybusDriverDaoImplSQL implements TrolleybusDriverDao {

        private final static String namespace = "trolleybusD_mapper";

        @Override
        public TrolleyBusDriver create(TrolleyBusDriver o) {
            SqlSession sqlSession = SessionFactory.getSession();
            sqlSession.insert(namespace + ".create", o);
            sqlSession.commit();
            sqlSession.close();
            return o;
        }

        @Override
        public TrolleyBusDriver getById(Long id) {
            SqlSession sqlSession = SessionFactory.getSession();
            TrolleyBusDriver a = sqlSession.selectOne(namespace + ".getById", id);
            sqlSession.close();
            return a;
        }

        @Override
        public List<TrolleyBusDriver> get() {
            SqlSession sqlSession = SessionFactory.getSession();
            List<TrolleyBusDriver> as = sqlSession.selectList(namespace + ".get");
            sqlSession.close();
            return as;
        }

        @Override
        public TrolleyBusDriver update(TrolleyBusDriver o) {
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
