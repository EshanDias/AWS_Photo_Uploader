package com.it15004000.sliit.ctseassignment2aws.controller;

import com.it15004000.sliit.ctseassignment2aws.model.AwsS3Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/")
public class AwsS3ClientController {

    private AwsS3Client awsS3Client;

    @Autowired
    AwsS3ClientController(AwsS3Client awsS3Client) {
        this.awsS3Client = awsS3Client;
    }
    
    @RequestMapping(value="/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        this.awsS3Client.uploadFile(file);
        return "File has been successfully uploaded";
    }
}