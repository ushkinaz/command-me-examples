/*
 * Copyright (c) 2010-2011, Dmitry Sidorenko. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.googlecode.commandme.examples;

import com.googlecode.commandme.CLIParser;
import com.googlecode.commandme.annotations.Action;
import com.googlecode.commandme.annotations.Option;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author Dmitry Sidorenko
 */
public class TestModule {
    @SuppressWarnings({"UnusedDeclaration"})
    private static final Logger LOGGER = LoggerFactory.getLogger(TestModule.class);

    private String optionString1;
    private String optionString2;

    private int     optionInt1;
    private Integer optionInt2;

    private Double optionDouble1;
    private double optionDouble2;

    private Date optionDate1;

    @Option
    public void setOptionString1(String optionString1) {
        this.optionString1 = optionString1;
    }

    @Option
    public void setOptionString2(String optionString2) {
        this.optionString2 = optionString2;
    }

    @Option
    public void setOptionInt1(int optionInt1) {
        this.optionInt1 = optionInt1;
    }

    @Option
    public void setOptionInt2(Integer optionInt2) {
        this.optionInt2 = optionInt2;
    }

    @Option
    public void setOptionDouble1(Double optionDouble1) {
        this.optionDouble1 = optionDouble1;
    }

    @Option
    public void setOptionDouble2(double optionDouble2) {
        this.optionDouble2 = optionDouble2;
    }

    @Option
    public void setOptionDate1(Date optionDate1) {
        this.optionDate1 = optionDate1;
    }

    @Action
    public void doParse() {

    }

    @Action
    public void makeLove() {

    }

    public static void main(String[] args) {
        CLIParser.createModule(TestModule.class).execute(args);
    }
}
