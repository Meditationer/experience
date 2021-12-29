package com.zf.jobbooking.web;

import com.zf.jobbooking.domain.compound.WorkRep;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @创建时间：2021/12/10
 * @描述 Controller
 */
@RestController
@RequestMapping(value = "/WorkRep")
public class WorkRepController {
    // 创建线程安全的Map，模拟users信息的存储      没上数据库
    static Map<String, WorkRep> workRepMap = Collections.synchronizedMap(new HashMap<String, WorkRep>());
    @GetMapping("/")
    public List<WorkRep> getUserList() {
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<WorkRep> r = new ArrayList<WorkRep>(workRepMap.values());
        return r;
    }
    @PostMapping("/")
    public String postUser(@RequestBody WorkRep workRep) {
        // @RequestBody注解用来绑定通过http请求中application/json类型上传的数据
        workRepMap.put(workRep.getA(), workRep);
        return "success";
    }
    @PostMapping("/")
    public String postUser(@RequestBody WorkRep workRep) {
        // @RequestBody注解用来绑定通过http请求中application/json类型上传的数据
        workRep.setName()
        workRepMap.put(workRep.getId(), workRep);
        return "success";
    }
}
