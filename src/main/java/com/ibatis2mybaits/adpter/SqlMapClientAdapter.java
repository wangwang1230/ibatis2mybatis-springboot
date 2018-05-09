package com.ibatis2mybaits.adpter;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

/**
 * Created by jinshuan.li on 2016/8/15.
 * 适配ibatis的sqlmaptemplete
 */
public interface SqlMapClientAdapter {

    SqlSession getSqlSession();

    int insert(String statement, Object params);

    <T> T queryForObject(String statement, Object params);

    int update(String statement, Object params);

    <T> List<T> queryForList(String statement, Object params);

    <T> List<T> queryForList(String statement);

    int delete(String statement, Object params);

    <T> T queryForObject(String statement);
}
