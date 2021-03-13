package com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.impl.sql;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.config.SessionFactory;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.DAO.transportdao.BusDao;
import com.java.automation.lab.fall.filimonov.core22.hierarchy.domain.transport.Bus;
import org.apache.ibatis.session.SqlSession;


import java.util.List;


public class BusDaoImplSQL implements BusDao {

        private final static String namespace = "bus_mapper";

        @Override
        public Bus create(Bus o) {
            SqlSession sqlSession = SessionFactory.getSession();
            sqlSession.insert(namespace + ".create", o);
            sqlSession.commit();
            sqlSession.close();
            return o;
        }

        @Override
        public Bus getById(Long id) {
            SqlSession sqlSession = SessionFactory.getSession();
            Bus a = sqlSession.selectOne(namespace + ".getById", id);
            sqlSession.close();
            return a;
        }

        @Override
        public List<Bus> get() {
            SqlSession sqlSession = SessionFactory.getSession();
            List<Bus> as = sqlSession.selectList(namespace + ".get");
            sqlSession.close();
            return as;
        }

        @Override
        public Bus update(Bus o) {
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
