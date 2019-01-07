package com.controller;

import com.entity.Demand;
import com.service.DemandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pact on 2019/1/3.
 */
@Api(value = "PacteraDemandController", description = "需求表")
@RestController
@RequestMapping("pactera_demand")
public class DemandController {
    @Autowired
    private DemandService demandService;

    @ApiOperation(value = "添加需求", notes = "添加需求")
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object add(@RequestBody Demand demand) {
            return demandService.insert(demand);

    }

    @ApiOperation(value = "更新需求", notes = "更新需求")
    @RequestMapping(value = "/update", method = { RequestMethod.POST})
    @ResponseBody
    public Object update(@RequestBody Demand demand) {
        return demandService.update(demand);
    }
    @ApiOperation(value = "删除需求", notes = "删除需求")
    @RequestMapping(value = "/delete", method = { RequestMethod.POST})
    @ResponseBody
    public Object delete(@RequestBody Demand demand) {
        return demandService.delete(demand);
    }
}
