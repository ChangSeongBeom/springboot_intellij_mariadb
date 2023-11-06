package com.example.testProject.dao;

import com.example.testProject.dto.TestDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestImpl implements TestDAO{

    private final SqlSession sqlSession;

    public TestImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
    @Override
    public List<TestDTO> getTestData() {
        return sqlSession.selectList("com.example.testProject.dao.TestDAO.getTestData");
    }
}
