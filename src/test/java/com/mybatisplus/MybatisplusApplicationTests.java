package com.mybatisplus;


import com.baomidou.dynamic.datasource.annotation.DSTransactional;
import com.mybatisplus.entity.Book;
import com.mybatisplus.entity.Students;
import com.mybatisplus.service.BookService;
import com.mybatisplus.service.StudentsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@SpringBootTest
class MybatisplusApplicationTests {

    @Resource
    StudentsService studentsService;
    @Resource
    BookService bookService;

    @Test
    @DSTransactional
    public void getLists() {
        System.out.println(studentsService.list());
        System.out.println("==============");
        System.out.println(bookService.list());
        Students students = new Students();
        students.setName("ceshi db55557777");
        studentsService.save(students);
        Book book = new Book();
        book.setBookName("ceshi db55557777");
        bookService.save(book);
        int i = 1/0;
    }

}
