package kg.database.jdbc;

import kg.database.entity.Author;
import kg.database.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Author> findAll() {
        return jdbcTemplate.query("SELECT * FROM Author",
                new BeanPropertyRowMapper<>(Author.class));
    }

    public Author findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM Author WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Author.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM Author WHERE id=?",
                new Object[]{id});

    }






}
