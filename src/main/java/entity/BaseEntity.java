package entity;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    private LocalDateTime createdDate;
    private String createdBy;
    private String lastModifiedBy;
    private LocalDateTime lastModifiedDate;
}
