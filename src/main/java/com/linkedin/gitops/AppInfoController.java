package com.linkedin.gitops;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class AppInfoController {

	@GetMapping
	public String getInfo() throws UnknownHostException {
		return this.getComputerName();
	}

	private String getComputerName() throws UnknownHostException {
		return InetAddress.getLocalHost().getHostName();
	}

}
