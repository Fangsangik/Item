package delivery;

import address.Address;
import entity.BaseEntity;
import lombok.Getter;
import order.Order;
import type.DeliveryStatus;

import javax.persistence.*;

@Entity
@Getter
public class Delivery extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;
}
