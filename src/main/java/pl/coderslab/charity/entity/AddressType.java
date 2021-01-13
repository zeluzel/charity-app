package pl.coderslab.charity.entity;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AddressType {

    private String street;
    private String city;
    private String zipCode;

}
