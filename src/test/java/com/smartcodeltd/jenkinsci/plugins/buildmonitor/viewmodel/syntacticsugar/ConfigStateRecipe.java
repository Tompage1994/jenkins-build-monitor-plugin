package com.smartcodeltd.jenkinsci.plugins.buildmonitor.viewmodel.syntacticsugar;

import com.smartcodeltd.jenkinsci.plugins.buildmonitor.Config;
import hudson.model.AbstractProject;

import java.util.Comparator;

public class ConfigStateRecipe {

    private Config config = Config.defaultConfig();

    public ConfigStateRecipe order(Comparator<AbstractProject> order) {
        config.setOrder(order);
        return this;
    }

    public Config execute() {
        return config;
    }
}
