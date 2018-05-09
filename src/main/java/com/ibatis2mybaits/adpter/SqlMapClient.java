package com.ibatis2mybaits.adpter;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


public class SqlMapClient implements SqlMapClientAdapter {

   private SqlSession sqlSession;

   @Override
   public SqlSession getSqlSession() {
       return sqlSession;
   }

   @Override
   public int insert(String statement, Object params) {
       return sqlSession.insert(statement, params);
   }

   @Override
   public <T> T queryForObject(String statement, Object params) {
       return sqlSession.selectOne(statement, params);
   }

   @Override
   public int update(String statement, Object params) {
       return sqlSession.update(statement, params);
   }

   @Override
   public <T> List<T> queryForList(String statement, Object params) {
       return sqlSession.selectList(statement, params);
   }

   @Override
   public <T> List<T> queryForList(String statement) {
       return sqlSession.selectList(statement);
   }

   @Override
   public int delete(String statement, Object params) {
      return sqlSession.delete(statement, params);
   }

   @Override
   public <T> T queryForObject(String statement) {
       return sqlSession.selectOne(statement);
   }

}
