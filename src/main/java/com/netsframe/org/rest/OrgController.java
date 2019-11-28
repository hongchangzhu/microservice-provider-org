package com.netsframe.org.rest;

import org.springframework.web.bind.annotation.*;

@RestController()
public class OrgController {
    @RequestMapping(value = "/org/query", method = RequestMethod.GET)
    public String query(@RequestParam("id") String id) {
        return "中国深圳-before-" + id;
    }
}
