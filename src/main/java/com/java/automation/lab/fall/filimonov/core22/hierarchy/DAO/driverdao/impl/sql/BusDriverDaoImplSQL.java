package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.driverdao.BusDriverDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.BusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.drivers.BusDriver;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class BusDriverDaoImplSQL implements BusDriverDao {

        private final static String namespace = "busD_mapper";

        @Override
        public BusDriver create(BusDriver o) {
            SqlSession sqlSession = SessionFactory.getSession();
            sqlSession.insert(namespace + ".create", o);
            sqlSession.commit();
            sqlSession.close();
            return o;
        }

        @Override
        public BusDriver getById(Long id) {
            SqlSession sqlSession = SessionFactory.getSession();
            BusDriver a = sqlSession.selectOne(namespace + ".getById", id);
            sqlSession.close();
            return a;
        }

        @Override
        public List<BusDriver> get() {
            SqlSession sqlSession = SessionFactory.getSession();
            List<BusDriver> as = sqlSession.selectList(namespace + ".get");
            sqlSession.close();
            return as;
        }

        @Override
        public BusDriver update(BusDriver o) {
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
