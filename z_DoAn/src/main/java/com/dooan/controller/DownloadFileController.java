package com.dooan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.dooan.fileservice.*;

public class DownloadFileController {


	@Autowired
	FileService fileServices;

    /*
     * Download Files
     */
	@GetMapping("/file")
	public ResponseEntity<InputStreamResource> downloadFile() {
		
		HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=customers.xlsx");
		
		return ResponseEntity
                .ok()
                .headers(headers)
                .body(new InputStreamResource(fileServices.loadFile()));	
	}
}

