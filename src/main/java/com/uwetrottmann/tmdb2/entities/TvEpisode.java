package com.uwetrottmann.tmdb2.entities;

import com.uwetrottmann.tmdb2.enumerations.EpisodeType;

import java.util.List;

public class TvEpisode extends BaseTvEpisode {

    public List<CrewMember> crew;

    public List<CastMember> guest_stars;

    public EpisodeType episode_type;


    public Images images;
    public TvEpisodeExternalIds external_ids;
    public Credits credits;
    public Videos videos;
    public Translations translations;

}
