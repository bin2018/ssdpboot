package com.controller;

import com.entity.PacteraDemand;
import com.entity.PacteraPlatformGroup;
import com.service.PacteraDemandService;
import com.service.PacteraPlatformGroupService;
import com.tools.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pact on 2019/1/3.
 */
@Api(value = "PacteraDemandController", description = "需求")
@RestController
@RequestMapping("pactera_demand")
public class PacteraDemandController {
    @Autowired
    private PacteraDemandService pacteraDemandService;
    @ApiOperation(value = "添加需求", notes = "添加需求接口")
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object add(@RequestBody PacteraDemand demand) {
            return pacteraDemandService.insert(demand);

    }
    @ApiOperation(value = "查询需求列表", notes = "添加需求接口")
    @RequestMapping(value = "/select", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object selectAll(@RequestBody PacteraDemand demand) {
        return pacteraDemandService.insert(demand);
    }
}
