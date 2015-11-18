package com.nick.example;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import com.google.common.collect.ImmutableMap;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.Map;


public class AliveSinceConfiguration extends Configuration {

    @NotEmpty
    private String template;

    private int defaultBirthYear = 2000;

    private int defaultBirthMonth = 1;

    private int defaultBirthDate = 1;

    @NotNull
    private Map<String, Map<String, String>> viewRendererConfiguration = Collections.emptyMap();

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public int getDefaultBirthYear() {
        return defaultBirthYear;
    }

    @JsonProperty
    public void setDefaultBirthYear(int defaultBirthYear) {
        this.defaultBirthYear = defaultBirthYear;
    }

    @JsonProperty
    public int getDefaultBirthMonth() {
        return defaultBirthMonth;
    }

    @JsonProperty
    public void setDefaultBirthMonth(int defaultBirthMonth) {
        this.defaultBirthMonth = defaultBirthMonth;
    }

    @JsonProperty
    public int getDefaultBirthDate() {
        return defaultBirthDate;
    }

    @JsonProperty
    public void setDefaultBirthDate(int defaultBirthDate) {
        this.defaultBirthDate = defaultBirthDate;
    }

    @JsonProperty("viewRendererConfiguration")
    public Map<String, Map<String, String>> getViewRendererConfiguration() {
        return viewRendererConfiguration;
    }

    @JsonProperty("viewRendererConfiguration")
    public void setViewRendererConfiguration(Map<String, Map<String, String>> viewRendererConfiguration) {
        ImmutableMap.Builder<String, Map<String, String>> builder = ImmutableMap.builder();
        for (Map.Entry<String, Map<String, String>> entry : viewRendererConfiguration.entrySet()) {
            builder.put(entry.getKey(), ImmutableMap.copyOf(entry.getValue()));
        }
        this.viewRendererConfiguration = builder.build();
    }
}
