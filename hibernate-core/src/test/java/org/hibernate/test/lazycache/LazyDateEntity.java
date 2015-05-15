package org.hibernate.test.lazycache;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.Date;

@Entity
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class LazyDateEntity {

    private Long id;

    private Date date;

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    @Basic(fetch = FetchType.LAZY)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    @Basic(fetch = FetchType.LAZY)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
