package com.example.hello.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable{
    @Id
    @GeneratedValue

    private Long id;
    private  String body;

    //link

//
//    public Comment() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getBody() {
//        return body;
//    }
//
//    public void setBody(String body) {
//        this.body = body;
//    }
//
//    @Override
//    public String toString() {
//        return "Comment{" +
//                "id=" + id +
//                ", body='" + body + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Comment comment = (Comment) o;
//        return Objects.equals(id, comment.id) &&
//                Objects.equals(body, comment.body);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, body);
//    }
}
