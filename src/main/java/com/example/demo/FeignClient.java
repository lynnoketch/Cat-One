package com.example.demo;

import com.example.demo.Models.Attachement;
import com.example.demo.Models.Student;
import org.springframework.web.bind.annotation.*;

@org.springframework.cloud.openfeign.FeignClient(name = "client", url = "http://10.51.10.111:2000")
public interface FeignClient {

    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student registerStudent(@RequestBody Student student);

  //  @RequestMapping(method = RequestMethod.POST, value = " companies/{companyId}/attachments")

}
