package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class ProfileModel {

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String name;

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String role;

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String bio;

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getBio() {
        return bio;
    }
}