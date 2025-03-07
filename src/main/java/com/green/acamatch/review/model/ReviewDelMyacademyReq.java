package com.green.acamatch.review.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Schema(description = "리뷰 삭제 요청")
public class ReviewDelMyacademyReq {

    @Schema(title = "유저 ID", description = "리뷰 삭제 요청을 한 유저의 ID", example = "1")
    private long userId;

    @Schema(title = "수업 고유 PK ID", description = "등록된 수업의 ID")
    private Long classId;

    @Schema(title = "리뷰 ID", description = "삭제할 리뷰의 ID", example = "1")
    private Long reviewId;

    @JsonIgnore
    private Long acaId;

    @JsonIgnore
    private Long joinClassId;
}