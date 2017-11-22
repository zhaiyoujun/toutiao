package zyj.toutiao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;


// ע���ע����Ϊspringmvc��controller��urlӳ��Ϊ"/home"
//@Controller
@RequestMapping("/home")
public class TestController {
    //���һ����־��

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    //ӳ��һ��action
    @RequestMapping("/index")
    public String index() {
        System.out.println("home");
        //�����־�ļ�
        logger.info("the first jsp pages");
        //����һ��index.jsp�����ͼ
        return "index";
    }
}
