package com.lines.demo.biz;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserHandler {
  
  @Autowired
  private SqlSessionTemplate sessionTemplate;
  
  public Object getUserList() {
    return sessionTemplate.selectList("selectUserList");
  }

}                         
                