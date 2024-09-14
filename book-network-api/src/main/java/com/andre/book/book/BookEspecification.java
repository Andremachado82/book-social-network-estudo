package com.andre.book.book;

import org.springframework.data.jpa.domain.Specification;

public class BookEspecification {

    public static Specification<Book> withOwnerId(Integer ownerId) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("owner").get("id"), ownerId));
    }
}
