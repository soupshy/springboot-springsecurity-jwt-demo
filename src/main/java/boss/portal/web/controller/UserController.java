package boss.portal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/user")
public class UserController {

    // 路由映射到/users
    @RequestMapping(value = "/users", produces="application/json;charset=UTF-8")
    public ModelMap usersList() {
        ModelMap modelMap = new ModelMap();
        ArrayList<String> users =  new ArrayList<String>(){{
            add("freewolf");
            add("tom");
            add("jerry");
        }};
        modelMap.put("userList",users);
        return modelMap;
    }

    @RequestMapping(value = "/hello")
    public ModelMap hello() {
        ModelMap modelMap = new ModelMap();
        ArrayList<String> users =  new ArrayList<String>(){{ add("hello"); }};
        modelMap.put("userList",users);
        return modelMap;
    }

    @RequestMapping(value = "/world", produces="application/json;charset=UTF-8")
    public ModelMap world() {
        ModelMap modelMap = new ModelMap();
        ArrayList<String> users =  new ArrayList<String>(){{ add("world"); }};
        modelMap.put("userList",users);
        return modelMap;
    }
}