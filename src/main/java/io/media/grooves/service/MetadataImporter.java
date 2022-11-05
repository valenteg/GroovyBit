package io.media.grooves.service;

import io.media.grooves.entity.MediaSource;

import java.util.List;
import java.util.Map;

public interface MetadataImporter {
    List<Map<String,Object>> importMetadata(MediaSource mediaSource);
}
