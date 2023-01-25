package com.mss.review.collection.domain;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RssReviewFeed {

    private String authorName;
    private String title;
    private String content;
    private double rating;
    private String appVersion;
    private LocalDateTime registerDate;

}
