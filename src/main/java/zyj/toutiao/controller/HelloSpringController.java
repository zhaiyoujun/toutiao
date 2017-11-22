package zyj.toutiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lyy on 2017-11-16.
 */
@Controller
public class HelloSpringController {
    String message = "Welcome to Spring MVC!";

    @RequestMapping("/hello")
    public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "Spring") String name) {

        ModelAndView mv = new ModelAndView("hellospring");//ָ����ͼ
        //����ͼ��������Ҫչʾ��ʹ�õ����ݣ�����ҳ����ʹ��
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }
}