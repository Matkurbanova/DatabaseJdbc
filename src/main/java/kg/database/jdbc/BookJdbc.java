package kg.database.jdbc;

import kg.database.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Book> findAll() {
        return jdbcTemplate.query("SELECT * FROM Book",
                new BeanPropertyRowMapper<>(Book.class));
    }

    public Book findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM Book WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Book.class));
    }
    public int deleteById(int id) {
        return  jdbcTemplate.update("DELETE FROM Book WHERE id=?",
                new Object[]{id});

    }





}
