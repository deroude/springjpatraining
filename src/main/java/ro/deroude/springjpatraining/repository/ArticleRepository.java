package ro.deroude.springjpatraining.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.deroude.springjpatraining.domain.Article;
import ro.deroude.springjpatraining.domain.User;

/**
 *
 * @author valentin.raduti
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

    public Page<Article> findByAuthor(User author, Pageable page);

}
