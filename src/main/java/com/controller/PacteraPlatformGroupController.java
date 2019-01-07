package com.controller;

import com.entity.Demand;
import com.entity.PacteraPlatformGroup;
import com.service.DemandService;
import com.service.PacteraPlatformGroupService;
import com.tools.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by pact on 2019/1/3.
 */
@Api(value = "PacteraPlatformGroupController", description = "供应商表")
@RestController
@RequestMapping("pactera_platform_group")
public class PacteraPlatformGroupController {
    @Autowired
    private PacteraPlatformGroupService ppGroupService;
    @ApiOperation(value = "登录接口", notes = "外包管理系统登录接口")
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object add(@RequestBody Page<PacteraPlatformGroup> page) {
            return ppGroupService.insert(page.getResult().get(0));

    }
}
