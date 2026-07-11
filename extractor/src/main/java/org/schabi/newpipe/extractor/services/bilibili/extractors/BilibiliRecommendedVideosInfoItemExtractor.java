package org.schabi.newpipe.extractor.services.bilibili.extractors;

import com.grack.nanojson.JsonObject;

import org.schabi.newpipe.extractor.exceptions.ParsingException;

/**
 * Identical to the trending item shape except that the recommended-videos API provides the video
 * URL directly ("uri") instead of a bvid.
 */
public class BilibiliRecommendedVideosInfoItemExtractor extends BilibiliTrendingInfoItemExtractor {

    public BilibiliRecommendedVideosInfoItemExtractor(final JsonObject json) {
        super(json);
    }

    @Override
    public String getUrl() throws ParsingException {
        return item.getString("uri") + "?p=1";
    }
}
