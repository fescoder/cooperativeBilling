package com.fescoder.cooperativebilling.customer.infrastructure.db.dbo;

import com.fescoder.cooperativebilling.customercoopservice.infrastructure.db.dbo.CustomerCoopserviceEntity;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity @Getter @Setter @Builder
// CONSTRUCTOR CON TODOS LOS ATRIBUTOS, OTRO SIN ATRIBUTOS Y BUILDER PARA CONSTRUIR NUEVAS INSTANCIAS MÁS FÁCIL
@AllArgsConstructor @NoArgsConstructor
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Hacer esto para las otras entidades, para que no rompa la secuencia del ID
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_generator")
    //@SequenceGenerator(name = "customer_id_generator", sequenceName = "customers_customer_id_seq", allocationSize = 1)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "house_number", nullable = false)
    private String houseNumber;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    private String dni;
    private String cuil;
    private String phone;
    private BigDecimal account;

    // Puede ser DATE el tipo
    @Column(name = "updated_at", nullable = false)
    // @Temporal(TemporalType.TIMESTAMP) // Para que se guarde con ese formato
    private LocalDateTime update;

    @Column(name = "created_at")
    private LocalDateTime create;




    @OneToMany(mappedBy = "customerEntity")
    private List<CustomerCoopserviceEntity> customerCoopserviceEntityList;

}
