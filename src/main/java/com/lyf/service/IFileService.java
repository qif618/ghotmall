package com.lyf.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by quincy
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
