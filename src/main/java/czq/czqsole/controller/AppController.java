package czq.czqsole.controller;

import com.alibaba.fastjson.JSON;
import czq.czqsole.annotation.MethodLog;
import czq.czqsole.dao.ProcessWorkMapper;
import czq.czqsole.dao.UserMapper;
import czq.czqsole.domain.ProcessWork;
import czq.czqsole.domain.User;
import czq.czqsole.service.UserService;
import czq.czqsole.service.WorkService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: czqsole
 * Date: 2018/6/13
 */
@RestController
public class AppController {

    @Resource
    UserMapper userMapper;
    @Resource
    ProcessWorkMapper processWorkMapper;
    @Resource
    WorkService workService;
    @Resource
    UserService userService;

    @RequestMapping("/")
    @MethodLog(description = "index2")
    public String index2() {
        return "Hello World2!";
    }

    @RequestMapping("/index")
    public User index() {
        return new User("aaa", 1);
    }

    @RequestMapping("/user/get")
    public User getUser(@RequestParam("name")String name) {
        User user = userService.getUser(name);
        if(user == null) {
            return new User("no user", 1);
        }
        return user;
    }

    @RequestMapping("/user/insert")
    public void insertUser(@RequestParam("name")String name, @RequestParam("id") int id) {
        User user = new User(name, id);
        userService.add(user);

    }

    @ResponseBody
    @RequestMapping("/api/work/update")
    public String update() {
        return "";
    }

    @ResponseBody
    @RequestMapping(value = "/api/work/add", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:8000")
    public String add(@RequestBody ProcessWork work /*String workName, String workDesc, Integer processPercent, Integer status*/) {
        if(work.getWorkName() == null) {
            return "";
        }
//        ProcessWork work = new ProcessWork();
//        work.setWorkName(workName);
//        work.setWorkDesc(workDesc);
//        work.setProcessPercent(processPercent);
//        work.setStatus(status);
        processWorkMapper.insert(work);
        return "";
    }

    @ResponseBody
    @RequestMapping("/api/work/query")
    @CrossOrigin(origins = "http://localhost:8000")
    public String queryWorkList() {
        List<ProcessWork> workList = workService.getAll();
        return JSON.toJSONString(workList);
    }
}
