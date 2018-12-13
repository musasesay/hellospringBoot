package com.example.hello.repository;

import com.example.hello.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  LinkRepository extends JpaRepository<Link,Long> {
}
