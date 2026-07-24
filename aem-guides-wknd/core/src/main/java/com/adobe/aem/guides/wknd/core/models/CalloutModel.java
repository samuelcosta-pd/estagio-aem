package com.adobe.aem.guides.wknd.core.models;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class CalloutModel {

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String buttonText;

    @ValueMapValue
    private String buttonUrl;

    public String getFileReference() {
        return fileReference;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getButtonText() {
        return buttonText;
    }

    public String getButtonUrl() {
        return buttonUrl;
    }

    public boolean isMostrarBotao() {
        return StringUtils.isNotBlank(buttonUrl);
    }

    public boolean hasContent() {
        return StringUtils.isNotBlank(fileReference)
            || StringUtils.isNotBlank(title)
            || StringUtils.isNotBlank(text)
            || isMostrarBotao();
    }

    public boolean isEmpty() {
        return !hasContent();
    }

    public String getButtonLabel() {
        return StringUtils.defaultIfBlank(buttonText, "Saiba mais");
    }
}
