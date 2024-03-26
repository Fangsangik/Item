package domain;

import lombok.Getter;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipCode;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getCity(), address.getCity()) && Objects.equals(getStreet(), address.getStreet()) && Objects.equals(getZipCode(), address.getZipCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreet(), getZipCode());
    }
}
