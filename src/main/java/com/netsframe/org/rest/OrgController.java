package com.netsframe.org.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class OrgController {
	@RequestMapping("/org/query/{id}")
	public String query(@PathVariable("id") String id) {
		return "中国深圳";
	}
}
