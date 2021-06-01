package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
@Getter
@Setter
public class Product {
    @Id @GeneratedValue
    @Column(name = "PRODUCT_ID")
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "products") //쓰지마라! 중간 테이블 자체에 Mapping Column 이외에 추가가 불가능하다.
    private List<Member> members = new ArrayList<>();
}
