package com.example.hello.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
//@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class Link  extends Auditable{

    @Id
    @GeneratedValue

    private Long id;
    @NonNull
    private String title;
    @NonNull
    private  String url;

    // Commits
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();

//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public Link() {  }
//
//    @Override
//    public String toString() {
//        return "Link{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                '}';
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Link link = (Link) o;
//        return Objects.equals(id, link.id) &&
//                Objects.equals(title, link.title);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, title);
//    }
}
