package com.usergio.admincar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Score")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int score;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_reservation", unique = true)
    private ReservationModel reservation;
}
