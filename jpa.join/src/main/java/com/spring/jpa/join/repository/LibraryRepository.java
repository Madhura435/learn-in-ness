package com.spring.jpa.join.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.jpa.join.model.Book;
import com.spring.jpa.join.model.Library;

public interface LibraryRepository extends JpaRepository<Library,Long> {
	
	//select * from library l inner JOIN  book b on l.libraryid=b.libraryid where b.name ="apjBiograpy"  and l.name="svm";
	//SELECT l FROM Library l JOIN l.books b where b.name = :bname
    @Query("SELECT l FROM Library l JOIN FETCH l.books b where b.name=:bname AND l.name=:lname")
	List<Library> getJoinInformation(@Param("bname") String bname,@Param("lname") String lname);
    
   // @Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    //public List<OrderResponse> getJoinInformation();

}
