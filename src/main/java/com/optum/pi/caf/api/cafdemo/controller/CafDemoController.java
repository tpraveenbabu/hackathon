/**
 * Created on Oct 30, 2017
 *
 * Copyright 2017 Optum, Inc. All rights reserved.
 * This file contains CONFIDENTIAL and PROPRIETARY information
 * and should not be distributed without prior written permission.
 */

package com.optum.pi.caf.api.cafdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The CafDemoController is the controller layer for all caf apis
 *
 * @author vrathnas
 * @version 1.0
 * @since 2017-10-30
 */
@RequestMapping(value = "/")
@RestController
public class CafDemoController {

    @RequestMapping(method = RequestMethod.GET)
    public String demoRequest() {

        return "Welcome to CAF API";
    }
}