package Hackathon.Chuck_Je.dto.board;

import Hackathon.Chuck_Je.domain.Article;
import lombok.Getter;

//글 목록 조회를 위한 dto
@Getter
public class ArticleResponse {
    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
