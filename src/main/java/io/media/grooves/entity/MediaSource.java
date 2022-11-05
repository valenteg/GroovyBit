package io.media.grooves.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MediaSource {
    private String id;
    private String name;
    private MediaSourceType type;
    private String value;
}
