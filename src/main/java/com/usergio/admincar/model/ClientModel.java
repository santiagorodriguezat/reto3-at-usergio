package com.usergio.admincar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 250)
    private String name;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String password;
    @Column(length = 3)
    private byte age;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_client", nullable = false)
    private List<MessageModel> messages;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_client", nullable = false)
    private List<ReservationModel> reservations;
}
