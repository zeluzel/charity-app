package pl.coderslab.charity.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "donations")
@Getter
@Setter
@ToString(exclude = {"categories", "institution"})
@NoArgsConstructor
@AllArgsConstructor
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    @ManyToMany
    @JoinColumn(name = "category_id")
    private List<Category> categories;

    @ManyToOne
    @JoinColumn(name = "institution_id")
    private Institution institution;

    @Embedded
    private AddressType address;

}
