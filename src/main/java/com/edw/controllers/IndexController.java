package com.edw.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *     com.edw.controllers.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 11 Mar 2022 15:39
 */
@RefreshScope
@RestController
public class IndexController {
    @Value("${name:Somewhat Default}")
    private String message;

    @GetMapping("/")
    public String getMessage() {
        return this.message;
    }
}
