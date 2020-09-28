package ir.maktab39.services.article;

import ir.maktab39.base.service.BaseServiceImpl;
import ir.maktab39.entities.Article;
import ir.maktab39.repositories.article.ArticleRepo;
import ir.maktab39.repositories.article.ArticleRepoImpl;

import java.util.List;

public class ArticleServiceImpl
        extends BaseServiceImpl<Long, Article, ArticleRepo> implements ArticleService {
    public ArticleServiceImpl() {
        super(ArticleRepoImpl.class, Article.class);
    }

    @Override
    public List<Article> getArticles() {
        return repository.getArticles();
    }
}
