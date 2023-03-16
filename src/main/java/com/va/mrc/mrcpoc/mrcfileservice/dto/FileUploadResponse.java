package com.va.mrc.mrcpoc.mrcfileservice.dto;

import lombok.Data;

//This class is used to return the response from the /uploadFile and /uploadMultipleFiles APIs.
@Data
public class FileUploadResponse {

    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public FileUploadResponse(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }
}
