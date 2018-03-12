package com.jetora.controller.user;

import com.jetora.pojo.User;
import com.jetora.service.user.UserService;
import com.jetora.utils.ResourceNotFoundException;
import com.jetora.utils.ResponseResult;
import com.jetora.utils.StringToolUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserHandler {
    @Autowired
    UserService userService ;
    /*
    @RequestMapping(value = "/getUserById",method = {RequestMethod.POST,RequestMethod.GET})
    public String getUserById(HttpServletRequest request,Model model){
        //参数
        Integer userId = StringUtils.notNull(request.getParameter("userId"))?Integer.parseInt(request.getParameter("userId")):1;
        User user = userService.getUserById(userId);
        model.addAttribute("user",user);
        return "test";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") String userid){
        Integer userId = StringToolUtils.notNull(userid)?Integer.parseInt(userid):1;
        User user = userService.getUserById(userId);
        return user;
    }

    @GetMapping(value = "/user/{id}", produces = { "application/json;charset=UTF-8" })
    public ResponseResult<User> employById(@PathVariable Integer id) {
        ResponseResult<User> result = new ResponseResult<User>();
        HttpStatus status = null;
        User user = userService.getUserById(id);
        if (user == null) {
            throw new ResourceNotFoundException(String.valueOf(id));
        }
        result.setCode(String.valueOf(HttpStatus.OK));
        result.setData(user);
        return result;
    }
    */
    /*
    通过 @ExceptionHandler 能将控制器的方法的异常场景分出来单独处理

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseResult<Object> handlerException(ResourceNotFoundException e) {
        ResponseResult<Object> result = new ResponseResult<Object>();
        result.setCode(String.valueOf(HttpStatus.NOT_FOUND));
        result.setDesc(e.getMessage());
        return result;
    }
    */
    /*
    @PostMapping(value = "/employ", produces = { "application/json;charset=UTF-8" })
    public int saveEmploy(@RequestBody EmployeeEntity employeeEntity) {
        return empService.save(employeeEntity);
    }
    */
    @GetMapping(value = "/user/{id}", produces = { "application/json;charset=UTF-8" })
    public ResponseResult<User> employById(@PathVariable Integer id) {
        ResponseResult<User> result = new ResponseResult<User>();
        HttpStatus status = null;
        User user = userService.getUserById(id);
        if (user == null) {
            throw new ResourceNotFoundException(String.valueOf(id));
        }
        result.setCode(String.valueOf(HttpStatus.OK));
        result.setData(user);
        return result;
    }
}
