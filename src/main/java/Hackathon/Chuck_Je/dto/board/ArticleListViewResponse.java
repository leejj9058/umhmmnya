package Hackathon.Chuck_Je.dto.board;

import Hackathon.Chuck_Je.domain.Article;
import lombok.Getter;

//뷰에게 데이터 전달을 위한 dto
@Getter
public class ArticleListViewResponse {
    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
