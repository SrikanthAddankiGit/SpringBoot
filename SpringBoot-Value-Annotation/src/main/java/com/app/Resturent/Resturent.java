package com.app.Resturent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("rest")

public class Resturent {
	
	@Value("${rest.rName}")
	private String rName;
	
	@Value("${rest.rAddr}")
	private String rAddr;
}
