package com.uwetrottmann.tmdb2.enumerations;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public enum EpisodeType {
    @SerializedName("standard")
    STANDARD("standard"),
    @SerializedName("mid_season")
    MID_SEASON("mid_season"),
    @SerializedName("finale")
    FINALE("finale");

    private static final Map<String, EpisodeType> lookup = prepareLookup();

    private static Map<String, EpisodeType> prepareLookup() {
        Map<String, EpisodeType> etMap = new HashMap<>();
        for (EpisodeType episodeType : EpisodeType.values()) {
            etMap.put(episodeType.value, episodeType);
        }
        return etMap;
    }

    private final String value;

    public static EpisodeType get(String value) {
        return lookup.get(value);
    }

    EpisodeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
