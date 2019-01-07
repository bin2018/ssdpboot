package com.controller;

import com.entity.User;
import com.service.UserService;
import com.tools.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pact on 2019/1/3.
 */
@Api(value = "PacteraUserController", description = "用户表")
@RestController
@RequestMapping("pactera_user")
public class UserController {
    @Autowired
    private UserService pUserService;

    @ApiOperation(value = "添加", notes = "外包管理系统登录接口")
    @RequestMapping(value = "/add", method = {  RequestMethod.POST})
    @ResponseBody
    public Object add(@RequestBody User pacteraUser) {
             return pUserService.insert(pacteraUser);
    }
    @ApiOperation(value = "更新", notes = "外包管理系统登录接口")
    @RequestMapping(value = "/update", method = {  RequestMethod.POST})
    @ResponseBody
    public Object update(@RequestBody User pacteraUser) {
        return pUserService.updateUser(pacteraUser);

    }
    @ApiOperation(value = "删除", notes = "外包管理系统登录接口")
    @RequestMapping(value = "/delete", method = { RequestMethod.POST})
    @ResponseBody
    public Object delete(@RequestBody User pacteraUser) {
        return pUserService.deleteUser(pacteraUser);
    }

    @ApiOperation(value = "查询用户列表", notes = "当前页参数 currentPage最小为1  不能为0")
    @RequestMapping(value = "/selectuser", method = { RequestMethod.POST})
    @ResponseBody
    public Object selectUser(@RequestBody Page<User> pageUser) {
        return pUserService.selectUser(pageUser);
    }
    @ApiOperation(value = "用户登录", notes = " 1:成功,0:用户名或密码错误")
    @RequestMapping(value = "/login", method = { RequestMethod.POST})
    @ResponseBody
    public Object login(@RequestBody User user) {
        return pUserService.login(user);
    }
}
