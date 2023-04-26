package com.usergio.admincar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="Car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String brand;
    private int year;
    @Column(length = 250)
    private String description;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_gama", nullable = false)
    private GamaModel gama;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_car", nullable = false)
    private List<MessageModel> messages;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_car", nullable = false)
    private List<ReservationModel> reservations;
}
