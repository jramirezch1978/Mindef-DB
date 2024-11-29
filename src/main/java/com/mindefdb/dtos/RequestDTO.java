package com.mindefdb.dtos;

import java.util.Map;

import lombok.Data;

@Data
public class RequestDTO {
	private String action;
    private Map<String, Object> data;
}
