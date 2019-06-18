package com.ysg.service.impl;

import com.ysg.po.CourseCustom;
import com.ysg.po.yisaige.UserInfo;
import com.ysg.service.CourseService;
import com.ysg.service.UserInfoService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: limengzhu
 * @DATE: 2019-06-18 21:46
 **/
public class UserInfoServiceImplTest {
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml",
                "spring/applicationContext-service.xml"});
    }

    @Test
    public void findById() throws Exception {

        CourseService courseService = (CourseService) applicationContext.getBean("courseServiceImpl");

        CourseCustom courseCustom = courseService.findById(1);

        System.out.println();
    }

    @Test
    public void findByTeacherID() throws Exception {

        UserInfoService userInfoService = (UserInfoService) applicationContext.getBean("userInfoServiceImpl");
        UserInfo userInfo = userInfoService.findByName("李孟柱");
        System.out.println();

    }
}
