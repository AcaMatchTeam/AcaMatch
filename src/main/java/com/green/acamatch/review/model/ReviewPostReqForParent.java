package com.green.acamatch.review.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Schema(description = "보호자 리뷰 등록 요청")
public class ReviewPostReqForParent {
    @JsonIgnore
    private Long studentId;

    @Schema(title = "유저 ID", description = "리뷰를 작성하는 유저의 ID", example = "20", required = true)
    private Long userId;

    @Schema(title = "증명 코드", description = "수업 증명 코드", example = "1", required = true)
    private int certification;

    @Schema(title = "수업 ID", description = "리뷰를 남길 수업 ID", example = "30", required = true)
    private Long classId;

    @Schema(title = "리뷰 내용", description = "작성할 리뷰 내용", example = "수업이 매우 유익했습니다!")
    private String comment;

    @Schema(title = "별점", description = "리뷰 별점", example = "5", required = true)
    private Double star;

    @JsonIgnore
    private Long reviewId; // 리뷰 ID (DB에서 생성되므로 요청에는 필요 없음)

    @JsonIgnore
    private Long joinClassId;
}
