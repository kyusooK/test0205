package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCancled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String userId;
    private String productId;
    private String productName;
    private Integer qty;

    public DeliveryCancled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCancled() {
        super();
    }
}
//>>> DDD / Domain Event
