package spring.ch06.board;

public interface ArticleDao {

	void insert(Article article);

	Article selectById(Integer id);

}