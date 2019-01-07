package com.controller;

import com.entity.PacteraPlatformGroup;
import com.entity.PacteraUser;
import com.service.PacteraPlatformGroupService;
import com.service.PacteraUserService;
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
public class PacteraUserController {
    @Autowired
    private PacteraUserService pUserService;

    @ApiOperation(value = "添加", notes = "外包管理系统登录接口")
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object add(@RequestBody PacteraUser pacteraUser) {
             return pUserService.insert(pacteraUser);

    }
    @ApiOperation(value = "更新", notes = "外包管理系统登录接口")
    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object update(@RequestBody PacteraUser pacteraUser) {
        return pUserService.updateUser(pacteraUser);

    }
    @ApiOperation(value = "删除", notes = "外包管理系统登录接口")
    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object delete(@RequestBody PacteraUser pacteraUser) {
        return pUserService.deleteUser(pacteraUser);

    }
    @ApiOperation(value = "查询用户列表", notes = "外包管理系统登录接口")
    @RequestMapping(value = "/selectuser", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object selectUser(@RequestBody Page<PacteraUser> pageUser) {
        return pUserService.selectUser(pageUser);
    }
    @ApiOperation(value = "用户登录", notes = " 1:成功,0:用户名或密码错误")
    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object login(@RequestBody PacteraUser User) {
        return pUserService.login(User);
    }
}
