package com.controller;

import com.entity.PlatformGroup;
import com.service.PlatformGroupService;
import com.tools.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pact on 2019/1/3.
 */
@Api(value = "PacteraPlatformGroupController", description = "供应商表")
@RestController
@RequestMapping("pactera_platform_group")
public class GroupController {
    @Autowired
    private PlatformGroupService ppGroupService;
    @ApiOperation(value = "登录接口", notes = "外包管理系统登录接口")
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object add(@RequestBody Page<PlatformGroup> page) {
            return ppGroupService.insert(page.getResult().get(0));

    }
}
