package com.va.mrc.mrcpoc.mrcfileservice.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/*
If you define additional file properties in future, you may simply add a corresponding field in the above class, and spring boot will automatically bind the field with the property value.
 */
@Data
@ConfigurationProperties(prefix = "file")  //on application startup and binds all the properties with prefix file to the corresponding fields of the POJO class.
public class FileConfigProperties {

    private String uploadDir;

}
